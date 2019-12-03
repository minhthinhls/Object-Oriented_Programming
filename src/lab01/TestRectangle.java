package lab01;

public class TestRectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 2);
        r1.visualize();
        Rectangle r2 = new Rectangle(5, 6);
        r2.visualize();
        Rectangle r3 = new Rectangle(-5, 6);
        r3.visualize();
        Rectangle r4 = new Rectangle(6, -5);
        r4.visualize();
        Rectangle r5 = new Rectangle(-2, -2);
        r5.visualize();

    }
}
