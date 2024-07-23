package Projects.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {
    private List<Book> books;

    public LibraryDatabase() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
