package Projects.MatrixOperations;

public class MatrixOperations {

    // Method to create and initialize a 2D array (matrix)
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

    // Method to print the main diagonal (diameter) of the matrix
    public static void printMainDiagonal(int[][] matrix) {
        System.out.println("Main Diagonal:");
        for (int i = 0; i < Math.min(matrix.length, matrix[0].length); i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    // Method to print the nth row of the matrix
    public static void printNthRow(int[][] matrix, int n) {
        System.out.println("Row " + n + ":");
        for (int j = 0; j < matrix[n].length; j++) {
            System.out.print(matrix[n][j] + " ");
        }
        System.out.println();
    }

    // Method to print the nth column of the matrix
    public static void printNthColumn(int[][] matrix, int n) {
        System.out.println("Column " + n + ":");
        for (int[] ints : matrix) {
            System.out.print(ints[n] + " ");
        }
        System.out.println();
    }

    // Method to swap the nth row with the nth column
    public static void swapRowWithColumn(int[][] matrix, int n) {
        System.out.println("Swapping row " + n + " with column " + n);
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[n][i];
            matrix[n][i] = matrix[i][n];
            matrix[i][n] = temp;
        }
    }

    // Method to transpose the matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        int[][] matrix = createMatrix(rows, cols);

        // Print the original matrix
        printMatrix(matrix);

        // Print the main diagonal
        printMainDiagonal(matrix);

        // Print the 2nd row
        printNthRow(matrix, 1);

        // Print the 2nd column
        printNthColumn(matrix, 1);

        // Swap the 2nd row with the 2nd column
        swapRowWithColumn(matrix, 1);
        printMatrix(matrix);

        // Transpose the matrix
        int[][] transposedMatrix = transposeMatrix(matrix);
        printMatrix(transposedMatrix);
    }
}
