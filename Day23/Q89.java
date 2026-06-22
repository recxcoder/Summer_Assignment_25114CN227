package Day23;

//Write a program to Find first non-repeating character.

import java.util.Scanner;

public class Q89 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Write text: ");
        String text = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char nonRepeatingChar = '_';

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] == 1) {
                nonRepeatingChar = c;
                break;
            }
        }

        if (nonRepeatingChar != '_') {
            System.out.println("First non-repeating character in " + "\"" + text + "\" is: " + nonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found in " + "\"" + text + "\"");
        }

        sc.close();
    }
}
