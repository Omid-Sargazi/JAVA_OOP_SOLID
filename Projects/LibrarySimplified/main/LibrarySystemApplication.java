package Projects.LibrarySimplified.main;

import Projects.LibrarySimplified.controller.UserController;
import Projects.LibrarySimplified.controller.BookController;
import Projects.LibrarySimplified.entity.Book;
import Projects.LibrarySimplified.entity.User;

public class LibrarySystemApplication {
    public static void main(String[] args) {
        UserController userController = new UserController();
        BookController bookController = new BookController();

        userController.registerUser("member", "john", "password123");
        userController.registerUser("librarian", "anna", "password123");

        if (userController.loginUser("john", "password123")) {
            System.out.println("Logged in as: " + userController.getLoggedInUser());
        } else {
            System.out.println("Login failed.");
        }

        if (userController.changePassword("password123", "newpassword123")) {
            System.out.println("Password changed.");
        } else {
            System.out.println("Password change failed.");
        }

        userController.logoutUser();
        System.out.println("Logged out.");

        bookController.addBook("B1", "The Great Gatsby", "F. Scott Fitzgerald");
        bookController.addBook("B2", "To Kill a Mockingbird", "Harper Lee");

        System.out.println("Search results: ");
        for (Book book : bookController.searchBook("Great")) {
            System.out.println(book);
        }

        // Borrow a book
        if (userController.loginUser("john", "newpassword123")) {
            bookController.borrowBook("B1");
            System.out.println("Book borrowed: B1");
        } else {
            System.out.println("Login failed.");
        }

        // Return a book
        bookController.returnBook("B1");
        System.out.println("Book returned: B1");

        // Logout
        userController.logoutUser();
        System.out.println("Logged out.");

    }
}
