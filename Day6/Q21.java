package Day6;

// Write a program to Convert decimal to binary. 

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print(num + " in Binary = ");

        StringBuilder binary = new StringBuilder();
        while (num  > 0) {
            binary.append(num%2);
            num /= 2;
        }
        System.out.println(binary.reverse());

        sc.close();
    }
}
