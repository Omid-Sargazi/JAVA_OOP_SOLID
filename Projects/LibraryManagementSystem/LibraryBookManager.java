package Projects.LibraryManagementSystem;

public class LibraryBookManager implements BookManager {
    @Override
    public void addBook(Book book) {
        System.out.println("Book added: " + book.getTitle());
    }

    @Override
    public void removeBook(Book book) {
        System.out.println("Book removed: " + book.getTitle());
    }
}
