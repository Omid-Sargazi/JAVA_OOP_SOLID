package Projects.LibrarySystemDesignwithSOLIDPrinciples.singleton;

import Projects.LibrarySystemDesignwithSOLIDPrinciples.controller.BookController;
import Projects.LibrarySystemDesignwithSOLIDPrinciples.controller.UserController;

public class LibrarySystem {
    private static LibrarySystem instance;
    private UserController userController;
    private BookController bookController;

    private LibrarySystem() {
        userController = new UserController();
        bookController = new BookController();
    }

    public static LibrarySystem getInstance() {
        if (instance == null) {
            instance = new LibrarySystem();
        }
        return instance;
    }

    public UserController getUserController() {
        return userController;
    }

    public BookController getBookController() {
        return bookController;
    }
}
