package Day01;

// Write a program to Print multiplication table of a given number

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int number = sc.nextInt();
          
        for (int i = 1; i <= 10; i++) {
            int product = number*i;
            System.out.println(number + "X" + i + "=" + product);
        }

        sc.close();
    }
}