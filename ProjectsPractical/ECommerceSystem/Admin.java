package ProjectsPractical.ECommerceSystem;

public class Admin extends User {
    public Admin(String username, String email) {
        super(username, email);
    }

    @Override
    public void purchase(Product product) {
        System.out.println(getUsername() + " approved purchase of " + product.getName());
    }

    public void addProduct(Product product) {
        System.out.println(getUsername() + " added product " + product.getName());
    }
}
