package Day19;

//Write a program to Subtract matrices.

public class Q74 {
    public static void main(String[] args) {
        
        int[][] matrix1 = {{2,4,6},
                           {8,10,12},
                           {14,16,18}};

        int[][] matrix2 = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] subtraction = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                subtraction[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("Subtract of matrix2 from matrix1 is: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(subtraction[i][j] + " ");
            }
            System.out.println();
        }
    }
}
