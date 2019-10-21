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
public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return String.format("MyTriangle[v1=(%f,%f),v2=(%f,%f),v3=(%f,%f)]",
                v1.getX(), v1.getY(), v2.getX(), v2.getY(), v3.getX(), v3.getY());
    }

    double distance(MyPoint v1, MyPoint v2) {
        return Math.sqrt(
                Math.pow(v1.getX() - v2.getX(), 2)
                + Math.pow(v1.getY() - v2.getY(), 2)
        );
    }

    double getPerimeter() {
        return distance(v1, v2) + distance(v1, v3) + distance(v2, v3);
    }

    String getType() {
        if (distance(v1, v2) == distance(v1, v3)
                && distance(v1, v3) == distance(v2, v3)) {
            return "Equilateral"; // 3 edges equal !!!
        }
        if (distance(v1, v2) != distance(v1, v3)
                && distance(v1, v3) != distance(v2, v3)
                && distance(v1, v2) != distance(v2, v3)) {
            return "Scalene"; // 3 edges unequal !!
        }
        return "Isosceles"; // At least 2 edges equal each other !
    }

}
