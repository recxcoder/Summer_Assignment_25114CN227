package Day12;

//Write a program to Write function for perfect number.

import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num<=2) {
            System.out.println(num + " is not a Perfect number.");
            sc.close();
            return;
        }
        int result = perfect(num);

        if (result==num) {
            System.out.println(num + " is a Perfect number");
        }
        else{
            System.out.println(num + " is not a Perfect number");
        }

        sc.close();
    }
    public static int perfect(int n){
        int sumOfFactor = 0;

        for (int i = 1; i <= n/2; i++) {
            if (n%i==0) {
                sumOfFactor += i;
            }
        }
        return sumOfFactor;
    }
}
