package JavaProblems.LibrarySystem;

public class Librarian extends User {

    public Librarian(String id, String name, String email) {
        super(id, name, email);

    }

    public void addBook(Book book) {

    }

    public void removeBook(Book book) {

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
