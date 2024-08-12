package ProjectsPractical.TwoDimensionalArray;

public class TwoDArray {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;

        int[][] array = new int[rows][cols];

        int value = 1;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {

                array[i][j] = value;
                value++;
            }

        System.out.println("The 2D array is: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
