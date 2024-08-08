package ProjectsPractical.ECommerceSystem;

public class SeasonalDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.9; // 10% discount
    }
}
