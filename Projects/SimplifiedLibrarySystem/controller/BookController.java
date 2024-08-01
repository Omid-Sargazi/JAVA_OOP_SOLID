package Projects.SimplifiedLibrarySystem.controller;

import java.util.ArrayList;
import java.util.List;

import Projects.SimplifiedLibrarySystem.entity.Book;

public class BookController {
    private List<Book> books;

    public BookController() {
        this.books = new ArrayList<>();
    }

    public void addBook(String id, String title, String author) {
        Book book = new Book(id, title, author);
        books.add(book);
    }

    public void removeBook(String id) {
        books.removeIf(book -> book.getId().equals(id));
    }

    public List<Book> searchBook(String keyword) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
                result.add(book);
            }
        }
        return result;
    }

    public Book getBookById(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(String id) {
        Book book = getBookById(id);
        if (book != null && !book.isBorrowed()) {
            book.setBorrowed(true);
        }
    }

    public void returnBook(String id) {
        Book book = getBookById(id);
        if (book != null && book.isBorrowed()) {
            book.setBorrowed(false);
        }
    }
}
