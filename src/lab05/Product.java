package lab05;

public class Product {

    private static int count = 0;
    private String productName;
    private Integer amount;
    private String description;

    public Product() {

    }

    public Product(String productName, Integer amount, String description) {
        this.productName = productName;
        this.amount = amount;
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getAmount() {
        return amount;
    }

    public boolean increaseAmount(Integer amount) {
        if (this.amount >= 0) {
            this.amount += amount;
            return true;
        }
        return false;
    }

    public boolean decreaseAmountByOne() {
        if (this.amount > 1) {
            this.amount -= 1;
            return true;
        }
        return false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Product.count++;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nAmount: %d\nDescription: %s",
                this.productName, this.amount, this.description);
    }

}
