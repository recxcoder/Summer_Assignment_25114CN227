package Day20;

// Write a program to Find row-wise sum.

public class Q79 {
    public static void main(String[] args) {
        
        int[][] A = { { 1, 2, 3 },
                      { 2, 4, 5 },
                      { 3, 5, 6 } };

        int rows = A.length;
        int cols = A[0].length;
        
        
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += A[i][j];
            }
            System.out.println("Addition of elements of " + i + " row is: " + sum);
        }
    }
}
