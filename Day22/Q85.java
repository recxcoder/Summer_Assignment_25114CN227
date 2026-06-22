package Day22;

//Write a program to Check palindrome string. 

import java.util.Scanner;
public class Q85 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Write text: ");
        String text = sc.nextLine();

        String lowerText = text.toLowerCase();

        char[] chars = lowerText.toCharArray();

        int start = 0;
        int end = text.length() - 1;

        boolean isPalindrome = true;

        while (start<end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(text + " is a Palindrome String.");
        }
        if (!isPalindrome) {
            System.out.println(text + " is not a Palindrome String.");
        }

        sc.close();
    }
}
