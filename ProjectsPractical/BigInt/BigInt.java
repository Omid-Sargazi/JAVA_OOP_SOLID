package ProjectsPractical.BigInt;

import java.math.BigInteger;

public class BigInt {

    private BigInteger value;

    public BigInt() {
        this.value = BigInteger.ZERO;
    }

    public BigInt(String val) {
        this.value = new BigInteger(val);
    }

    public BigInt(BigInteger val) {
        this.value = val;
    }

    public BigInt(int val) {
        this.value = BigInteger.valueOf(val);
    }

    public BigInt add(BigInt other) {
        return new BigInt(this.value.add(other.value));
    }

    public BigInt subtract(BigInt other) {
        return new BigInt(this.value.subtract(other.value));
    }

    public BigInt multiply(BigInt other) {
        return new BigInt(this.value.multiply(other.value));
    }
}
