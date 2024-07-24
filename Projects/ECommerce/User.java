package Projects.ECommerce;

public abstract class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public abstract void purchase(Product product);

    @Override
    public String toString() {
        return "User{" + "username='" + username + '\'' + ", email='" + email + '\'' + '}';
    }
}
