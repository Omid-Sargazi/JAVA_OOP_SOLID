package Projects.onlineshoppingsystem.entity;

public class Customer extends User {
    private ShoppingCart shoppingCart;

    public Customer(String username, String password) {
        super(username, password);
        this.shoppingCart = new ShoppingCart();
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public void showDetails() {
        System.out.println("Customer [Username=" + getUsername() + "]");
    }
}
