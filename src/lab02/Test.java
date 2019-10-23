/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

/**
 *
 * @author Minh Thinh
 */
public class Test {

    public static void main(String[] args) {
        Particle p = new Particle();
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("X:%2d\tY:%2d", p.getX(), p.getY()));
            p.move();
        }
    }
}
