package Day12;

// Write a program to Write function for Armstrong.

import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int result = armstrong(num);

        if (num == result) {
            System.out.println(num + " is a Armstrong number.");
        } else {
            System.out.println(num + " is not a Armstrongg number.");
        }
        sc.close();
    }

    public static int armstrong(int n) {
        int finalNum = 0;
        int temp = n;
        int numOfDigits = 0;
        while (temp > 0) {
            numOfDigits++;
            temp /= 10;
        }
        while (n > 0) {
            int digit = n % 10;
            finalNum += (int) Math.pow(digit, numOfDigits);
            n /= 10;
        }
        return finalNum;
    }
}
