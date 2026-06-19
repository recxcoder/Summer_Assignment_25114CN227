package Day19;

//Write a program to Transpose matrix.

public class Q75 {
    public static void main(String[] args) {
        
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transpose of matrix is:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
