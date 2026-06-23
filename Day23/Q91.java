package Day23;

//Write a program to Check anagram strings

import java.util.Arrays;
import java.util.Scanner;

public class Q91 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text 1: ");
        String text1 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        System.out.print("Enter text 2: ");
        String text2 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        if (text1.length() != text2.length()) {
            System.out.println("Not anagram strings.");
            sc.close();
            return;
        }

        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println(text1 + " and " + text2 + " are anagram strings");
        } else {
            System.out.println(text1 + " and " + text2 + " are not anagram strings");
        }

        sc.close();
    }
}
