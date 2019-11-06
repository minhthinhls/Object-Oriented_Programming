/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

/**
 *
 * @author Student
 */
public class B extends A {

    private String color;

    public B(int x, int y, int z, String color) {
        super(x, y, z);
        this.color = color;
    }

    public B(A a, String color) {
        super(a);
        this.color = color;
    }

}
