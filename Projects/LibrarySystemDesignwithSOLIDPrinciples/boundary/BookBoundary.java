package Projects.LibrarySystemDesignwithSOLIDPrinciples.boundary;

import java.util.List;

import Projects.LibrarySystemDesignwithSOLIDPrinciples.controller.BookController;
import Projects.LibrarySystemDesignwithSOLIDPrinciples.entity.Book;

public class BookBoundary {
    private BookController bookController;

    public BookBoundary(BookController bookController) {
        this.bookController = bookController;
    }

    public void addBook(String id, String title, String author) {
        Book book = new Book(id, title, author);
        bookController.addBook(book);
        System.out.println("Book added: " + book);
    }

    public void removeBook(String bookId) {
        bookController.removeBook(bookId);
        System.out.println("Book removed with ID: " + bookId);
    }

    public void searchBook(String keyword) {
        List<Book> results = bookController.searchBook(keyword);
        System.out.println("Search results:");
        for (Book book : results) {
            System.out.println(book);
        }
    }

    public void borrowBook(String bookId) {
        Book book = bookController.getBookById(bookId);
        if (book != null) {
            bookController.borrowBook(book);
            System.out.println("Book borrowed: " + book);
        } else {
            System.out.println("Book not found with ID: " + bookId);
        }
    }

    public void returnBook(String bookId) {
        Book book = bookController.getBookById(bookId);
        if (book != null) {
            bookController.returnBook(book);
            System.out.println("Book returned: " + book);
        } else {
            System.out.println("Book not found with ID: " + bookId);
        }
    }
}
