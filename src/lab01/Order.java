package lab01;

import java.util.List;

public class Order {

    private final int ID;
    private final List<Item> items;
    private static int numOrders = 0;

    public Order(List items) {
        this.ID = ++numOrders;
        this.items = items;
    }

    double calculateAverageCost() {
        double sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum / items.size();
    }
}
