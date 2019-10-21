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
public class MyOval extends MyBoundedShape {

    private float majorRadius;
    private float minorRadius;

    public MyOval(float majorRadius, float minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    float GetArea() {
        return majorRadius * minorRadius * (float) Math.PI;
    }

    @Override
    void Draw() {
        System.out.println("Drawing oval, but i'm too lazy to implement. Do it your self !");
    }

}
