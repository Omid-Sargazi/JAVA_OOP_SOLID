package ProjectsPractical.BigIntt;

import java.util.Arrays;

public class BigInt {
    private int[] digits;
    private boolean isNegative;

    // Constructor: Initializes BigInt from a string
    public BigInt(String number) {
        if (number == null || number.isEmpty()) {
            throw new IllegalArgumentException("Number cannot be null or empty");
        }

        isNegative = number.charAt(0) == '-';
        String numStr = isNegative ? number.substring(1) : number;

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

    public BigInt add(BigInt other) {
        if (this.isNegative == other.isNegative) {
            return new BigInt(addArrays(this.digits, other.digits), this.isNegative);
        } else {
            int comparison = compareAbsolute(other);
            if (comparison == 0) {
                return new BigInt("0");
            } else if (comparison > 0) {
                return new BigInt(subtractArrays(this.digits, other.digits), this.isNegative);
            } else {
                return new BigInt(subtractArrays(other.digits, this.digits), other.isNegative);
            }
        }
    }

    public BigInt subtract(BigInt other) {
        if (this.isNegative != other.isNegative) {
            return new BigInt(addArrays(this.digits, other.digits), this.isNegative);
        } else {
            int comparison = compareAbsolute(other);
            if (comparison == 0) {
                return new BigInt("0");
            } else if (comparison > 0) {
                return new BigInt(subtractArrays(this.digits, other.digits), this.isNegative);
            } else {
                return new BigInt(subtractArrays(other.digits, this.digits), !this.isNegative);
            }
        }
    }

    public BigInt multiply(BigInt other) {
        boolean resultNegative = this.isNegative != other.isNegative;
        return new BigInt(multiplyArrays(this.digits, other.digits), resultNegative);
    }
}
