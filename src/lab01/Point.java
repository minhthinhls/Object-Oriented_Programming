package lab01;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private double x;
    private double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        return sqrt(pow((this.x - p.x), 2) + pow((this.y - p.y), 2));
    }
}
