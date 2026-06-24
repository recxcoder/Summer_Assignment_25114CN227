package Day24;

//Write a program to Remove duplicate characters.

import java.util.Scanner;
import java.util.HashSet;

public class Q96 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        HashSet<Character> checked = new HashSet<>();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (checked.add(ch)) {
                result.append(ch);
            }
        }

        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}
