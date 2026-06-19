package Day20;

// Write a program to Multiply matrices.

public class Q77 {
    public static void main(String[] args) {

        int[][] A = { { 1, 2, 3 },
                      { 4, 5, 6 } };

        int[][] B = { { 1, 2 },
                      { 4, 5 },
                      { 7, 8 } };

        if (A.length != B[0].length) {
            System.out.println("Multiplication of Martrices is not possible.");
            return;
        }
        int rows = A.length;
        int cols = B[0].length;

        int[][] C = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < B.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Multiplication of matrix A and B is: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
