package Projects.Library.controller;

import Projects.Library.entity.Book;

import java.util.List;
import java.util.ArrayList;

public class BookController {
    private List<Book> books;

    public BookController() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String bookId) {
        books.removeIf(book -> book.getId().equals(bookId));
    }

    public List<Book> searchBook(String keyword) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
                results.add(book);
            }
        }
        return results;
    }

    public Book getBookById(String bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(Book book) {
        books.remove(book);
    }

    public void returnBook(Book book) {
        books.add(book);
    }

}
