package Projects.SimplifiedLibrarySystem.entity;

public class User {
    private String username;
    private String password;
    private String type;

    public User(String username, String password, String type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
