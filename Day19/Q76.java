package Day19;

//Write a program to Find diagonal sum. 

public class Q76 {
    public static void main(String[] args) {

        int[][] matrix1 = { { 1, 2, 3 },
                            { 4, 5, 6 },
                            { 7, 8, 9 } };

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int diagonalSum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    diagonalSum += matrix1[i][j];
                }
            }
        }
        System.out.println("Diagonal sum of matrix is: " + diagonalSum);
    }
}
