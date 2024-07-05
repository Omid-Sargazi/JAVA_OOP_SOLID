package Shopping.boundary;

import Shopping.Controller.ShoppingCartController;
import Shopping.entity.Product;

public class ShoppingCartBoundary {
    private ShoppingCartController shoppingCartController;

    public ShoppingCartBoundary(ShoppingCartController shoppingCartController) {
        this.shoppingCartController = shoppingCartController;
    }

    public void addProductToCart(Product product) {
        shoppingCartController.addProductToCart(product);
        System.out.println("Added to cart: " + product);
    }

    public void removeProductFromCart(Product product) {
        shoppingCartController.removeProductFromCart(product);
        System.out.println("Removed from cart: " + product);
    }

    public void clearCart() {
        shoppingCartController.clearCart();
        System.out.println("Cart cleared.");
    }

    public void viewCart() {
        shoppingCartController.viewCart();
    }
}
