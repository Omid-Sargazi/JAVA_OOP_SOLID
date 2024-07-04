package Shopping.entity;

public class Customer extends User {

    public Customer(String username, String password) {
        super(username, password);
    }

    @Override
    public void showDetails() {
        System.out.println("Customer [Username=" + getUsername() + "]");
    }
}
