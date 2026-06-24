package Day24;

//Write a program to Check string rotation. 

import java.util.Scanner;

public class Q93 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("No rotation");
        } else {
            String temp = str1 + str2;

            if (temp.contains(str2)) {
                System.out.println(str2 + " is rotation of " + str1);
            } else {
                System.out.println(str2 + " is not a rotation of " + str2);
            }
        }

        sc.close();
    }
}
