package Projects.onlineshoppingsystem.main;

import Projects.onlineshoppingsystem.boundary.UserBoundary;
import Projects.onlineshoppingsystem.controller.ShoppingCartController;
import Projects.onlineshoppingsystem.controller.UserController;
import Projects.onlineshoppingsystem.entity.Product;
import Projects.onlineshoppingsystem.entity.ShoppingCart;
import Shopping.boundary.ShoppingCartBoundary;

public class OnlineShoppingMain {
    public static void main(String[] args) {
        // Initialize controllers
        UserController userController = new UserController();
        ShoppingCart shoppingCart = new ShoppingCart();
        ShoppingCartController shoppingCartController = new ShoppingCartController(shoppingCart);

        // Initialize boundaries
        UserBoundary userBoundary = new UserBoundary(userController);
        ShoppingCartBoundary shoppingCartBoundary = new ShoppingCartBoundary(shoppingCartController);

        // Register users
        userBoundary.registerUsers();

        // User login
        userBoundary.login("customer1", "password1");
        userBoundary.showLoggedInUserDetails();

        // Change password
        userBoundary.changePassword("password1", "newpassword");
        userBoundary.logout();

        // Login with new password
        userBoundary.login("customer1", "newpassword");
        userBoundary.showLoggedInUserDetails();

        // Add products to cart
        Product product1 = new Product("P1", "Laptop", 1200.0);
        Product product2 = new Product("P2", "Smartphone", 800.0);
        shoppingCartBoundary.addProductToCart(product1);
        shoppingCartBoundary.addProductToCart(product2);

        // View cart
        shoppingCartBoundary.viewCart();

        // Remove product from cart
        shoppingCartBoundary.removeProductFromCart(product1);
        shoppingCartBoundary.viewCart();

        // Clear cart
        shoppingCartBoundary.clearCart();
        shoppingCartBoundary.viewCart();

        // User logout
        userBoundary.logout();
    }
}
