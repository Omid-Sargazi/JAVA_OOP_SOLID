package ProjectsPractical.ECommerceSystem;

public class ClearanceDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.5; // 50% discount
    }
}
