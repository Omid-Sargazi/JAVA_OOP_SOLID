package Projects.LibrarySystemDesignwithSOLIDPrinciples.main;

import Projects.LibrarySystemDesignwithSOLIDPrinciples.boundary.BookBoundary;
import Projects.LibrarySystemDesignwithSOLIDPrinciples.boundary.UserBoundary;
import Projects.LibrarySystemDesignwithSOLIDPrinciples.singleton.LibrarySystem;

public class LibrarySystemApplication {
    public static void main(String[] args) {
        LibrarySystem librarySystem = LibrarySystem.getInstance();
        UserBoundary userBoundary = new UserBoundary(librarySystem.getUserController());
        BookBoundary bookBoundary = new BookBoundary(librarySystem.getBookController());

        // User registration
        userBoundary.registerUser("member", "john", "password123");
        userBoundary.registerUser("librarian", "anna", "password123");

        // User login
        userBoundary.login("john", "password123");
        userBoundary.showLoggedInUserDetails();

        // Change password
        userBoundary.changePassword("password123", "newpassword123");

        // Logout
        userBoundary.logout();

        // Librarian login
        userBoundary.login("anna", "password123");

        // Add books
        bookBoundary.addBook("B1", "The Great Gatsby", "F. Scott Fitzgerald");
        bookBoundary.addBook("B2", "To Kill a Mockingbird", "Harper Lee");

        // Search books
        bookBoundary.searchBook("Great");

        // Borrow a book
        userBoundary.login("john", "newpassword123");
        bookBoundary.borrowBook("B1");

        // Return a book
        bookBoundary.returnBook("B1");

        // Logout
        userBoundary.logout();
    }
}
