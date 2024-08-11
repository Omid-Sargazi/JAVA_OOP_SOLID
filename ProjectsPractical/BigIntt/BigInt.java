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

    public BigInt divide(BigInt other) {
        if (other.equals(new BigInt("0"))) {
            throw new ArithmeticException("Division by zero");
        }
        boolean resultNegative = this.isNegative != other.isNegative;
        return new BigInt(divideArrays(this.digits, other.digits), resultNegative);
    }

    public BigInt mod(BigInt other) {
        if (other.equals(new BigInt("0"))) {
            throw new ArithmeticException("Division by zero");
        }
        boolean resultNegative = this.isNegative;
        return new BigInt(modArrays(this.digits, other.digits), resultNegative);
    }

    public int compareTo(BigInt other) {
        if (this.isNegative != other.isNegative) {
            return this.isNegative ? -1 : 1;
        }

        int comparison = compareAbsolute(other);
        return this.isNegative ? -comparison : comparison;
    }

    private int compareAbsolute(BigInt other) {
        if (this.digits.length != other.digits.length) {
            return this.digits.length - other.digits.length;
        }

        for (int i = 0; i < this.digits.length; i++) {
            if (this.digits[i] != other.digits[i]) {
                return this.digits[i] - other.digits[i];
            }
        }

        return 0;
    }

    private int[] addArrays(int[] a, int[] b) {
        int maxLength = Math.max(a.length, b.length);
        int[] result = new int[maxLength + 1];
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int aDigit = i < a.length ? a[a.length - 1 - i] : 0;
            int bDigit = i < b.length ? b[b.length - 1 - i] : 0;
            int sum = aDigit + bDigit + carry;
            result[result.length - 1 - i] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;
        return trimLeadingZeros(result);
    }
}
