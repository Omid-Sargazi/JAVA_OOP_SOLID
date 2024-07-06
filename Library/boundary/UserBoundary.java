package Library.boundary;

import Library.controller.UserController;
import Library.entity.User;

public class UserBoundary {
    private UserController userController;

    public UserBoundary(UserController userController) {
        this.userController = userController;
    }

    public void registerUser(String type, String username, String password) {
        userController.registerUser(type, username, password);
        System.out.println(type + " registered successfully.");
    }

    public void login(String username, String password) {
        if (userController.loginUser(username, password)) {
            System.out.println(username + " logged in successfully.");
        } else {
            System.out.println("Login failed.");
        }
    }

    public void logout() {
        userController.logoutUser();
        System.out.println("User logged out successfully.");
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (userController.changePassword(oldPassword, newPassword)) {
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Password change failed.");
        }
    }

    public void showLoggedInUserDetails() {
        User user = userController.getLoggedInUser();
        if (user != null) {
            user.showDetails();
        } else {
            System.out.println("No user is logged in.");
        }
    }

}