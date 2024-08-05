package ProjectsPractical.LibraryManagementSystem;

public class Librarian extends User {
    public Librarian(String name, String id) {
        super(name, id);
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println(getName() + " issued " + book.getTitle());
    }

    public void addBook(Book book) {
        System.out.println(getName() + " added " + book.getTitle());
    }
}
