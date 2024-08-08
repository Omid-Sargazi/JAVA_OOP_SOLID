package ProjectsPractical.ECommerceSystem;

public class Customer extends User {
    public Customer(String username, String email) {
        super(username, email);
    }

    @Override
    public void purchase(Product product) {
        System.out.println(getUsername() + " purchased " + product.getName());
    }
}
