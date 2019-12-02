package lab05;

import java.util.ArrayList;

public class ProductList {

    private ArrayList<Product> listOfProduct = new ArrayList<>();

    public ProductList() {

    }

    public ProductList(ArrayList<Product> listOfProduct) {
        this.listOfProduct = listOfProduct;
    }

    public ArrayList<Product> getListProducts() {
        return listOfProduct;
    }

    public void addProduct(String productName, int amount, String description) {
        listOfProduct.add(new Product(productName, amount, description));
    }

    public void addProduct(Product newProduct) {
        listOfProduct.add(newProduct);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product item : listOfProduct) {
            sb.append(item.toString());
        }
        return sb.toString();
    }

}
