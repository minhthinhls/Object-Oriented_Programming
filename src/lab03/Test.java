/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Minh Thinh
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----SHAPES-----");
        List<MyShape> listShapes = new ArrayList<>();
        for (int i = 1; i <= 5; i++) { // Input <5> shapes
            System.out.print(String.format("Please choose shape[%d]: [line, oval, rectangle] -> ", i));
            try {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("line")) {
                    System.out.print("-> Enter Length: ");
                    listShapes.add(new MyLine(sc.nextFloat()));
                    sc.nextLine();
                } else if (line.equalsIgnoreCase("oval")) {
                    System.out.print("-> Enter Major & Minor Radius: ");
                    listShapes.add(new MyOval(sc.nextFloat(), sc.nextFloat()));
                    sc.nextLine();
                } else if (line.equalsIgnoreCase("rectangle")) {
                    System.out.print("-> Enter Height & Width: ");
                    listShapes.add(new MyRectangle(sc.nextFloat(), sc.nextFloat()));
                    sc.nextLine();
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("=> Input error ! Type [line] or [oval] or [rectangle]");
                i--;
            }
        }
        for (MyShape s : listShapes) {
            s.Draw();
            if (s instanceof MyBoundedShape) {
                System.out.println(
                        String.format(
                                "-> Area of %s is: %f",
                                s.getClass().getSimpleName(),
                                ((MyBoundedShape) s).GetArea()
                        )
                );
            }
        }
        System.out.println("\n-----TRIANGLE AND POINTS-----");
        MyTriangle triangle = new MyTriangle(
                new MyPoint(1, 2),
                new MyPoint(2, 3),
                new MyPoint(4, 5)
        );
        System.out.println(
                String.format(
                        "Type: %s \nPerimeter: %f \ntoString: %s",
                        triangle.getType(),
                        triangle.getPerimeter(),
                        triangle.toString()
                )
        );
        System.out.println("\n-----PERSON, STUDENT & STAFF-----");
        Staff staff = new Staff(
                "Tran Thanh Tung",
                "Binh Thanh District",
                "International University",
                2000
        );
        System.out.println(
                String.format(
                        "Name: %s \nAddress: %s \nSchool: %s \nPay: %f \ntoString: %s",
                        staff.getName(),
                        staff.getAddress(),
                        staff.getSchool(),
                        staff.getPay(),
                        staff.toString()
                )
        );
        System.out.println("\n-----POINT2D & POINT3D-----");
        Point3D point3d = new Point3D(2, 5, 3);
        System.out.println(
                String.format(
                        "X: %s \nY: %s \nZ: %s \ntoString: %s",
                        point3d.getX(),
                        point3d.getY(),
                        point3d.getZ(),
                        point3d.toString()
                )
        );
    }
}
