/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author Minh Thinh
 */
public class MyLine extends MyShape {

    private float length;

    public MyLine(float length) {
        this.length = length;
    }

    @Override
    void Draw() {
        System.out.println("Drawing line, but i'm too lazy to implement. Do it your self !");
    }

}
