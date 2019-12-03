package lab01;

public class Rectangle {

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle(int width, int height) {
        if (width < 0) {
            System.out.println("Error input width, width = 1");
            width = 1;
        }
        this.width = width;
        if (height < 0) {
            System.out.println("Error input height, height = 1");
            height = 1;
        }
        this.height = height;
    }

    public void visualize() {
        System.out.println(this);
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
