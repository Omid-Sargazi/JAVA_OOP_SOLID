package Projects.LibrarySystemDevelopmentUsingDAD;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> listBooks() {
        return books;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(
                    "Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }
    }
}