package Day02;

// Write a program to Reverse a number

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int originalNumber = num;
        int reverseNum = 0;
        int digit;

        while (num != 0) {
            digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;

        }
        System.out.println("Reverse of " + originalNumber + " = " + reverseNum);

        sc.close();
    }
}
