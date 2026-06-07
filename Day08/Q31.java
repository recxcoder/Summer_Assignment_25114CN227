package Day08;

/*
Write a program to Print character triangle.
A
AB
ABC
ABCD
ABCDE
*/

public class Q31 {
    public static void main(String[] args) {
        
        for (char i = 'A'; i <= 'E' ; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
