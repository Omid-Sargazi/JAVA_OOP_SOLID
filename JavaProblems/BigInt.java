package JavaProblems;

import java.util.Arrays;

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

    // Multiplication
    public BigInt multiply(BigInt other) {
        boolean resultNegative = this.isNegative != other.isNegative;
        return new BigInt(multiplyArrays(this.digits, other.digits), resultNegative);
    }

    // Division
    public BigInt divide(BigInt other) {
        if (other.equals(new BigInt("0"))) {
            throw new ArithmeticException("Division by zero");
        }
        boolean resultNegative = this.isNegative != other.isNegative;
        return new BigInt(divideArrays(this.digits, other.digits), resultNegative);
    }

    // Modulus
    public BigInt mod(BigInt other) {
        if (other.equals(new BigInt("0"))) {
            throw new ArithmeticException("Division by zero");
        }
        boolean resultNegative = this.isNegative;
        return new BigInt(modArrays(this.digits, other.digits), resultNegative);
    }

    // Comparison
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
            int sum = carry;

            if (i < a.length) {
                sum += a[a.length - 1 - i];
            }
            if (i < b.length) {
                sum += b[b.length - 1 - i];
            }

            result[result.length - 1 - i] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;
        return trimLeadingZeros(result);
    }

    private int[] subtractArrays(int[] a, int[] b) {
        int[] result = new int[a.length];
        int borrow = 0;

        for (int i = 0; i < a.length; i++) {
            int aDigit = a[a.length - 1 - i];
            int bDigit = i < b.length ? b[b.length - 1 - i] : 0;
            int diff = aDigit - bDigit - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[result.length - 1 - i] = diff;
        }

        return trimLeadingZeros(result);
    }

    private int[] multiplyArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            int carry = 0;
            for (int j = 0; j < b.length; j++) {
                int product = result[result.length - 1 - i - j] + a[a.length - 1 - i] * b[b.length - 1 - j] + carry;
                result[result.length - 1 - i - j] = product % 10;
                carry = product / 10;
            }
            result[result.length - 1 - i - b.length] += carry;
        }

        return trimLeadingZeros(result);
    }

    private int[] divideArrays(int[] dividend, int[] divisor) {
        // Initialize quotient array
        int[] quotient = new int[dividend.length];

        // Copy dividend for modification
        int[] dividendCopy = Arrays.copyOf(dividend, dividend.length);

        // Division algorithm
        for (int i = 0; i <= dividend.length - divisor.length; i++) {
            int[] divisorShifted = shiftLeft(divisor, dividend.length - divisor.length - i);
            while (compareAbsoluteArrays(dividendCopy, divisorShifted) >= 0) {
                dividendCopy = subtractArrays(dividendCopy, divisorShifted);
                quotient[i]++;
            }
        }

        return trimLeadingZeros(quotient);
    }

    private int[] modArrays(int[] dividend, int[] divisor) {
        // Copy dividend for modification
        int[] dividendCopy = Arrays.copyOf(dividend, dividend.length);

        // Modulus algorithm
        for (int i = 0; i <= dividend.length - divisor.length; i++) {
            int[] divisorShifted = shiftLeft(divisor, dividend.length - divisor.length - i);
            while (compareAbsoluteArrays(dividendCopy, divisorShifted) >= 0) {
                dividendCopy = subtractArrays(dividendCopy, divisorShifted);
            }
        }

        return trimLeadingZeros(dividendCopy);
    }

    private int[] shiftLeft(int[] array, int n) {
        int[] result = new int[array.length + n];
        System.arraycopy(array, 0, result, 0, array.length);
        return result;
    }

    // Private method: Compare two arrays of digits
    private int compareAbsoluteArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return a.length - b.length;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return a[i] - b[i];
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        BigInt num1 = new BigInt("123");
    }
}
