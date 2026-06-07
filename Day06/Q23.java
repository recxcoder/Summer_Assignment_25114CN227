package Day06;

//Write a program to Count set bits in a number.

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int setCount = 0;

        while (temp > 0) {
            if (temp%2 == 1) {
                setCount++;
            }
            temp /= 2;
        }

        System.out.println("Number of set bits in " + num + " are: " + setCount);

        sc.close();
    }
}
 