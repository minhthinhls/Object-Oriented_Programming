/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Minh Thinh
 */
public class Box {

    static int WIDTH;
    static int HEIGHT;
    private static Box BOX; // Singleton pattern !
    private static Collection<Particle> particles;
    static int[][] positionMatrix;

    private Box(int width, int height, int numParticles) {
        // Private constructor to avoid client applications to use constructor !
        Box.WIDTH = width;
        Box.HEIGHT = height;
        positionMatrix = new int[height + 1][width + 1]; // Range [0, height][0, width]
        particles = new HashSet<>();
        for (int i = 0; i < numParticles; i++) {
            particles.add(new Particle());
        }
        Box.updatePositionMatrix();
    }

    public static List<int[]> allParticlesMove() {
        for (Particle particle : particles) {
            particle.move();
        }
        Box.updatePositionMatrix();
        return Box.getCollidingPosition();
    }

    private static List<int[]> getCollidingPosition() {
        List<int[]> collidePos = new ArrayList<>();
        int numParticlesAdded = 0;
        for (int i = 0; i <= Box.HEIGHT; i++) {
            for (int j = 0; j <= Box.WIDTH; j++) {
                if (Box.positionMatrix[i][j] <= 1) {
                    continue; // Skip because there's no collision here !!!
                }
                numParticlesAdded += Box.positionMatrix[i][j] - 1;
                collidePos.add(new int[]{i, j});
            }
        }
        for (int i = 0; i < numParticlesAdded; i++) {
            particles.add(new Particle());
        }
        Box.updatePositionMatrix();
        return collidePos;
    }

    private static void updatePositionMatrix() {
        for (int[] row : positionMatrix) {
            Arrays.fill(row, 0); // Reset all values in positionMatrix to 0 !
        }
        for (Particle particle : particles) {
            positionMatrix[particle.getY()][particle.getX()] += 1;
        }
    }

    /**
     * Singleton pattern !
     *
     * @param width
     * @param height
     * @param numParticles
     * @return
     * @throws InstantiationException
     */
    public static Box createBox(int width, int height, int numParticles) throws InstantiationException {
        if (BOX == null) {
            BOX = new Box(width, height, numParticles);
            return BOX;
        }
        throw new InstantiationException("Box has already been created !");
    }

    /**
     * Singleton pattern !
     *
     * @return
     * @throws NullPointerException
     */
    public static Box getBox() throws NullPointerException {
        if (BOX == null) {
            throw new NullPointerException("Cannot get the Box !");
        }
        return BOX;
    }

    public static int getNumParticles() {
        return particles.size();
    }

}
