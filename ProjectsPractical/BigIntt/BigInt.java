package ProjectsPractical.BigIntt;

public class BigInt {
    private int[] digits;
    private boolean isNegative;

    // Constructor: Initializes BigInt from a string
    public BigInt(String number) {
        if (number == null || number.isEmpty()) {
            throw new IllegalArgumentException("Number cannot be null or empty");
        }
}
