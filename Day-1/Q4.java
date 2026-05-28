// Write a program to Count digits in a number

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int number = n;
        int count = 0;

        while (n>0) {
            n = n/10;
            count++;
        }
        System.out.println("Number of digit in " + number + " = " + count);

        sc.close();
    }
}