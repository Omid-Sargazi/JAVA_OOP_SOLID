package ProjectsPractical.ECommerceSystem;

public class ECommerce {
    public static void main(String[] args) {
        User customer = new Customer("john_doe", "john@example.com");
        User admin = new Admin("admin_user", "admin@example.com");

        Product product = new Product("P001", "Laptop", 1200.00);

        customer.purchase(product);
        admin.purchase(product);
    }
}
