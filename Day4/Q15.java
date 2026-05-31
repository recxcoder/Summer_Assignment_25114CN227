package Day4;

//Write a program to Check Armstrong number.

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int digit = 0;
        int temp = num;

        while (temp > 0) {
            digit++;
            temp /= 10;
        }
        
        long sum = 0;
        temp = num;

        while (temp > 0) {
            int d = temp % 10;
            sum += (long) Math.pow(d, digit);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else
            System.out.println(num + " is not an Armstrong number.");

        sc.close();
    }
}
