package Projects.OnlineShopping;

public abstract class OnlineShopping {
    public abstract PaymentMethod createPaymentMethod(String type);

    public void checkout(String paymentType, double amount) {
        PaymentMethod paymentMethod = createPaymentMethod(paymentType);
        paymentMethod.processPayment(amount);
    }
}