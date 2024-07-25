package Projects.ECommerce;

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        PaymentService paymentService = new PaymentService(creditCardPayment);
        paymentService.processPayment(500.00);

        Payment payPalPayment = new PayPalPayment();
        paymentService = new PaymentService(payPalPayment);
        paymentService.processPayment(250.00);
    }
}
