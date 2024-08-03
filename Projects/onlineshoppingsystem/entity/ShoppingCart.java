package Projects.onlineshoppingsystem.entity;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void clearCart() {
        products.clear();
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "ShoppingCart [Products=" + products + "]";
    }
}
