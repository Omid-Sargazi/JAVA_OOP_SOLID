package ProjectsPractical.TwoDimensionalArray.ImplementationTwoDArrayUser;

import java.util.Scanner;

public class GetArrayUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = scan.nextInt();

        System.out.println("Enter number of columns");
        int columns = scan.nextInt();

        int[][] multidimensionalArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                multidimensionalArray[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(multidimensionalArray[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
