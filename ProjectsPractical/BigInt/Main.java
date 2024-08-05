package ProjectsPractical.BigInt;

public class Main {
    public static void main(String[] args) {
        BigInt a = new BigInt("123456789012345678901234567890");
        BigInt b = new BigInt("987654321098765432109876543210");

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        BigInt sum = a.add(b);
        System.out.println("a + b: " + sum);
    }
}
