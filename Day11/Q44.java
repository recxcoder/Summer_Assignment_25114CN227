package Day11;

//Write a program to Write function to find factorial.

import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);

        sc.close();
    }

    public static int factorial(int n){
        if (n==1) {
            return 1;
        }
        return n * factorial (n-1);
    }
}
