package Projects.DrawShapeWithStar;

import java.util.Scanner;;

public class P03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = input.nextInt();

        for (int x = 1; x <= n; x++)

        {
            for (int z = 0; z <= n - x; z++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= x; y++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
