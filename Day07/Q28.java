package Day07;

//Write a program to Recursive reverse number. 

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Reverse of " + num + " is: ");
        System.out.print(reverse(num,0));

        sc.close();
    }

    public static int reverse(int n, int result) {
        if (n == 0) {
            return result;
        }
        int digit = n % 10;

        return reverse(n/10, result*10 + digit);
    }
}
