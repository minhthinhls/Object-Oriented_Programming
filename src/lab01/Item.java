package lab01;

public class Item {

    private final int ID;
    private final int price;
    private final String name;

    private static int numItems = 0;

    public Item(String name, int price) {
        this.ID = ++numItems;
        this.name = name;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
