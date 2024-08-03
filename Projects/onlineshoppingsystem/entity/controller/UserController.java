package Projects.onlineshoppingsystem.entity.controller;

import java.util.HashMap;
import java.util.Map;

import Projects.onlineshoppingsystem.entity.User;

public class UserController {
    private Map<String, User> users;
    private User loggedInUser;

    public UserController() {
        users = new HashMap<>();
        loggedInUser = null;
    }

    public void registerUser(User user) {
        users.put(user.getUsername(), user);
    }

    public boolean loginUser(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            loggedInUser = user;
            return true;
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
