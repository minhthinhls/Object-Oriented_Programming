package lab01;

public class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public String verify() {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Not triangle";
        }
        if (a == b && b == c) {
            return "Equilateral";
        }
        if (a == b || b == c || c == a) {
            return "Isosceles";
        }
        return "Scalene";
    }
}
