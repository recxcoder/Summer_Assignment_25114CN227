package Day9;
/*
Write a program to Print reverse star pattern.
*****
****
***
**
*

*/
public class Q33 {
    public static void main(String[] args) {
     
        for (int i = 1; i <= 5 ; i++) {
            for (int j = i; j <= 5 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
