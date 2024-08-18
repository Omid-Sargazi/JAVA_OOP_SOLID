package JavaProblems.LibrarySystem;

public abstract class User {
    protected String id;
    protected String name;
    protected String email;

    public User(String id, String name, String email) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public abstract void login();

    public abstract void logout();
}
