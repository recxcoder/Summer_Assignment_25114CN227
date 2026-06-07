package Day01;

// Write a program to Calculate sum of first N natural number

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        
        int sum = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sum += (i+1);
        }

        System.out.println("Sum of first " + n + " natural number = " + sum);

        sc.close();
    }
    
}