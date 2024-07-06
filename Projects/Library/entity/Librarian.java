package Projects.Library.entity;

public class Librarian extends User {

    public Librarian(String username, String password) {
        super(username, password);
    }

    @Override
    public void showDetails() {
        System.out.println("Librarian [Username=" + getUsername() + "]");
    }
}
