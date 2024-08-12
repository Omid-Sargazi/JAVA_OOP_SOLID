package ProjectsPractical.TwoDimensionalArray.ImplementationTwoDArrayUser;

public class MatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rowsFirst = firstMatrix.length;
        int colsFirst = firstMatrix[0].length;
        int rowsSecond = secondMatrix.length;
        int colsSecond = secondMatrix[0].length;

        int[][] result = new int[rowsFirst][colsSecond];

        // Multiply the matrices
        for (int k = 0; k < rowsFirst; k++) {

            for (int j = 0; j < colsSecond; j++) {

                for (int i = 0; i < colsFirst; i++) {
                    result[k][j] = firstMatrix[k][i] * secondMatrix[i][j];
                }
            }
        }
        return result;

    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] firstMatrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
        };

        int[][] secondMatrix = {
                { 7, 8 },
                { 9, 10 },
                { 11, 12 },
        };

        if (firstMatrix[0].length != secondMatrix.length) {
            System.out.println("Matrices cannot be multiplied.");
            return;
        }

        int[][] resultMatrix = multiplyMatrices(firstMatrix, secondMatrix);

        System.out.println("Resultant Matrix: ");
        printMatrix(resultMatrix);
    }
}
