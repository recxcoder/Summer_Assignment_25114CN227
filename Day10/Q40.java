package Day10;

/*
Write a program to Print character pyramid.
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/
public class Q40 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            for (int j = 1; j <= ('E' - i); j++) {
                System.out.print(" ");
            }
            for (char j = 'A'; j < i; j++) {
                System.out.print(j);
            }
            for (char j = i; j >= 'A'; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// I was confused in for loop for printing spaces. 
// Previously I was using: for(char j = 'A'; j <= (*'E' - 1))  which is incorrect