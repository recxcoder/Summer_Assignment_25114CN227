package Day12;

//Write a program to Write function for palindrome.

import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println(num + " cannot be Palindrome.");
            sc.close();
            return;
        }

        int finalNum = reverseNum(num);
        if (finalNum == num) {
            System.out.println(num + " is a Palindrome number.");
        } else {
            System.out.println(num + " is not a Palindrome number.");
        }
        sc.close();
    }

    public static int reverseNum(int n){
        int reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10; 
        }
        return reverse;
    }
}
