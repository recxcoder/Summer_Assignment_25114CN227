// Write a program to Check whether a number is palindrome.

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int originalNumber = num;
        int digit, reverseNum = 0;

        while (num != 0) {
            digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        if (reverseNum == originalNumber) {
            System.out.println(originalNumber + " is a Palindrome");
        } else
            System.out.println(originalNumber + " is not a Palindrome");

        sc.close();
    }
}
