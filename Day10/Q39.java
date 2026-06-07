package Day10;
/*
Write a program to Print number pyramid.
    1
   121
  12321
 1234321
123454321

*/
public class Q39 {
    public static void main(String[] args) {
        
        int row = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
