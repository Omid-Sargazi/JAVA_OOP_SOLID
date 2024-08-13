package JavaProblems;

public class BigInt {
    private int[] digits;
    private boolean isNegative;

    public BigInt(String number) {
        if (number == null && number.isEmpty()) {
            throw new IllegalArgumentException("Number cannot be null or empty");
        }
        isNegative = number.charAt(0) == '-';
        String numStr = isNegative ? number.substring(1) : number;
        System.out.println(numStr);
        digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            if (!Character.isDigit(numStr.charAt(i))) {
                throw new IllegalArgumentException("Invalid character in number string");
            }
            digits[i] = numStr.charAt(i) - '0';
        }
    }

    private BigInt(int[] digits, boolean isNegative) {
        this.digits = digits;
        this.isNegative = isNegative;
    }

    public static void main(String[] args) {
        BigInt num1 = new BigInt("123");
    }
}
