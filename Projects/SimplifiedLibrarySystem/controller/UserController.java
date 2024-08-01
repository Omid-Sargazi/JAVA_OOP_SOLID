package Projects.SimplifiedLibrarySystem.controller;

import Projects.SimplifiedLibrarySystem.entity.User;
import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User> users;
    private User loggedInUser;

    public UserController() {
        this.users = new ArrayList<>();
        this.loggedInUser = null;
    }

    public void registerUser(String type, String username, String password) {
        User user = new User(username, password, type);
        users.add(user);
    }

    public boolean loginUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                loggedInUser = user;
                return true;
            }
        }
        return false;
    }

    public void logoutUser() {
        loggedInUser = null;
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (loggedInUser != null && loggedInUser.getPassword().equals(oldPassword)) {
            loggedInUser.setPassword(newPassword);
            return true;
        }
        return false;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }
}
