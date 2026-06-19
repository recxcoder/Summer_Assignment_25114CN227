package Day20;

// Write a program to Find column-wise sum.

public class Q80 {
    public static void main(String[] args) {
        int[][] A = { { 1, 2, 3 },
                      { 2, 4, 5 },
                      { 3, 5, 6 } };

        int rows = A.length;
        int cols = A[0].length;
        
        
        for (int i = 0; i < cols; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum += A[j][i];
            }
            System.out.println("Addition of elements of " + i + " coloum is: " + sum);
        }
    }
}
