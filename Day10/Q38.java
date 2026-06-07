package Day10;

/*
Write a program to Print reverse pyramid.
*********
 *******
  *****
   ***
    *
    
 */
public class Q38 {
   public static void main(String[] args) {

      int row = 5;

      for (int i = 1; i <= row; i++) {
         for (int j = 1; j <= (i - 1); j++) {
            System.out.print(" ");
         }
         for (int j2 = 1; j2 <= (2 * (row - i) + 1); j2++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}
