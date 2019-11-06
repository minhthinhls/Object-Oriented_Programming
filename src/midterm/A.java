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
public class A {

    public int x;
    protected int y;
    private int z;

    public A(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public A(A a) {
        this.x = a.x;
        this.y = a.y;
        this.z = a.z;
    }

}
