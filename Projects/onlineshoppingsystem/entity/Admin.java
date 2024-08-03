package Projects.onlineshoppingsystem.entity;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void showDetails() {
        System.out.println("Admin [Username=" + getUsername() + "]");
    }
}
