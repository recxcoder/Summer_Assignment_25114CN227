package Day23;

//Write a program to Find maximum occurring character.

import java.util.Scanner;

public class Q92 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Write text: ");
        String text = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int maxCount = -1;
        char maxChar = ' ';

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] > maxCount) {
                maxCount = freq[c];
                maxChar = c;
            }
        }

        if (text.length() > 0) {
            System.out.println("Maximum occurring character is '" + maxChar + "' (appears " + maxCount + " times)");
        } else {
            System.out.println("The string is empty.");
        }

        sc.close();
    }

}
