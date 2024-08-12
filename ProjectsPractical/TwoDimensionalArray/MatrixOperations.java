package ProjectsPractical.TwoDimensionalArray;

public class MatrixOperations {
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }

    public static void printMainDiagonal(int[][] matrix) {
        for (int i = 0; i < Math.min(matrix.length, matrix[0].length); i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    public static void printNthRow(int[][] matrix, int n) {
        System.out.println();
        System.out.print("Row " + n + ":");
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[n][j] + " ");
        }
        // System.out.println();
    }

    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] matrix = createMatrix(rows, cols);

        printMainDiagonal(matrix);
        printNthRow(matrix, 2);
    }
}
