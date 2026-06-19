package Day20;

// Write a program to Check symmetric matrix.

public class Q78 {
    public static void main(String[] args) {

        int[][] A = { { 1, 2, 3 },
                      { 2, 4, 5 },
                      { 3, 5, 6 } };

        if (A.length != A[0].length) {
            System.out.println("Matrix A is not a square matrix, Transpose cann't be possible.");
            return;
        }

        int rows = A.length;
        int cols = A[0].length;

        boolean isSymmetric = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (A[i][j] != A[j][i]) {
                    isSymmetric = false;
                    break;          
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("Matrix A is symmetrix matrix");
        } else {
            System.out.println("Matrix A is not a symmetrix matrix");
        }
    }
}
