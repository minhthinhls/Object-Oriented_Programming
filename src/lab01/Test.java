package lab01;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Item A = new Item("Beef", 10000);
        Item B = new Item("Hotdog", 20000);
        Item C = new Item("Chicken", 30000);

        Order ord1 = new Order(Arrays.asList(A, B));
        Order ord2 = new Order(Arrays.asList(B, C));
        Order ord3 = new Order(Arrays.asList(C, A));

        System.out.println(ord1.calculateAverageCost());
        System.out.println(ord2.calculateAverageCost());
        System.out.println(ord3.calculateAverageCost());

    }
}
