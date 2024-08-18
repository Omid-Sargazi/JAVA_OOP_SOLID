package JavaProblems.LibrarySystem;

public class Librarian extends User {

    public Librarian(String id, String name, String email) {
        super(id, name, email);

    }

    @Override
    public void login() {
        System.out.println("Librarian logged in");
    }

    @Override
    public void logout() {

        System.out.println("Librarian logged out");

    }
}
