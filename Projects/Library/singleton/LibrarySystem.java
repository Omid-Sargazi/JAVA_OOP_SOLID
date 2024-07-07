package Projects.Library.singleton;

import Projects.Library.controller.UserController;
import Projects.Library.controller.BookController;

public class LibrarySystem {
    private static LibrarySystem instance;
    private UserController userController;
    private BookController bookController;

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
