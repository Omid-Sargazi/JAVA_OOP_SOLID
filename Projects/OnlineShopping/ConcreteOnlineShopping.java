package Projects.OnlineShopping;

public class ConcreteOnlineShopping extends OnlineShopping {
    @Override
    public PaymentMethod createPaymentMethod(String type) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCard();
            case "paypal":
                return new PayPal();
            default:
                throw new IllegalArgumentException("Unknown payment method type");
        }
    }
}
