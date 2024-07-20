package Projects.DrawShapeWithStar;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();

        for (int x = 1; x <= n; x++) {
            for (int z = 1; z <= n - x; z++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            for (int y = 1; y <= x - 1; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
