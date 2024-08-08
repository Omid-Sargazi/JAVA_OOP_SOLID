package ProjectsPractical.ECommerceSystem;

public class ECommerceProductManager implements ProductManager {
    @Override
    public void addProduct(Product product) {
        System.out.println("Product added: " + product.getName());
    }

    @Override
    public void removeProduct(Product product) {
        System.out.println("Product removed: " + product.getName());
    }
}
