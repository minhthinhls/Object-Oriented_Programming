/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.Random;

/**
 *
 * @author Minh Thinh
 */
public class Particle {

    private int x;
    private int y;
    private int dx;
    private int dy;

    private enum Directions {
        N, NE, E, SE, S, SW, W, NW
    }

    private static final Directions[] DIRECTIONS = Directions.values();
    private static final Random RANDOM = new Random();

    public Particle() {
        this.x = RANDOM.nextInt(Box.WIDTH);
        this.y = RANDOM.nextInt(Box.HEIGHT);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move() {
        Directions direct = DIRECTIONS[RANDOM.nextInt(8)];
        switch (direct) {
            case N:
                dy = y - 1;
                break;
            case NE:
                dx = x + 1;
                dy = y - 1;
                break;
            case E:
                dx = x + 1;
                break;
            case SE:
                dx = x + 1;
                dy = y + 1;
                break;
            case S:
                dy = y + 1;
                break;
            case SW:
                dx = x - 1;
                dy = y + 1;
                break;
            case W:
                dx = x - 1;
                break;
            case NW:
                dx = x - 1;
                dy = y - 1;
                break;
            default:
                break;
        }
        if (dx < 0 || dy < 0) { // If Out of bound error !
            this.move(); // Particle recursively move again until success;
        }
        this.x = dx;
        this.y = dy;
    }

}
