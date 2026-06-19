package Day19;

//Write a program to Add matrices

public class Q73 {
    public static void main(String[] args) {
        
        int[][] matrix1 = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};

        int[][] matrix2 = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] sum = new int[rows][cols]; 

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Addition of matrices is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}
