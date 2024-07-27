package Projects.OnlineShopping;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        OnlineShopping shopping = new ConcreteOnlineShopping();
        shopping.checkout("creditcard", 150.00);
        shopping.checkout("paypal", 75.00);
    }
}
