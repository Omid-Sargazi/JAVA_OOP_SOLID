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
}
