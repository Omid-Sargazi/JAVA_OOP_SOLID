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

    public static void main(String[] args) {
        BigInt num1 = new BigInt("123");
    }
}
