package Day10;

/*
Write a program to Print star pyramid.
    *
   ***
  *****
 *******
*********

*/
public class Q37 {
    public static void main(String[] args) {

        int row = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= (2 * i - 1); j2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
