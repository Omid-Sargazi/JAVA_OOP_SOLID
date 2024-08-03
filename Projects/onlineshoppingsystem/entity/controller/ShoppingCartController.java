package Projects.onlineshoppingsystem.entity.controller;

import Projects.onlineshoppingsystem.entity.ShoppingCart;

public class ShoppingCartController {
    private ShoppingCart shoppingCart;

    public ShoppingCartController(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addProductToCart(Product product) {
        shoppingCart.addProduct(product);
    }

    public void removeProductFromCart(Product product) {
        shoppingCart.removeProduct(product);
    }

    public void clearCart() {
        shoppingCart.clearCart();
    }

    public void viewCart() {
        System.out.println(shoppingCart);
    }
}
