package Day6;

//Write a program to Convert binary to decimal.

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int temp = binary;
        int power = 0;

        while (temp > 0) {
            int r = temp % 10;
            decimal += r * Math.pow(2, power);
            power++;
            temp /= 10;
        }
        System.out.println(binary + " in decimal is: " + decimal);
        sc.close();
    }
}
