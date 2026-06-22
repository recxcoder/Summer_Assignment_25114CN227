package Day23;

//Write a program to Find first repeating character.

import java.util.Scanner;

public class Q90 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Write text: ");
        String text = sc.nextLine();

        String lowerText = text.toLowerCase();

        int[] freq = new int[256];

        for (int i = 0; i < lowerText.length(); i++) {
            freq[lowerText.charAt(i)]++;
        }

        char repeatingChar = '\0';

        for (int i = 0; i < lowerText.length(); i++) {
            char c = lowerText.charAt(i);
            if (freq[c] != 1) {
                repeatingChar = c;
                break;
            }
        }

        if (repeatingChar != '_') {
            System.out.println("First repeating character in " + "\"" + text + "\" is: " + repeatingChar);
        } else {
            System.out.println("No repeating character found in " + "\"" + text + "\"");
        }

        sc.close();
    }
}