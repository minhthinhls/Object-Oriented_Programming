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
public class MyRectangle extends MyBoundedShape {

    private float height;
    private float width;

    public MyRectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    @Override
    float GetArea() {
        return height * width;
    }

    @Override
    void Draw() {
        System.out.println("Drawing rectangle, but i'm too lazy to implement. Do it your self !");
    }

}
