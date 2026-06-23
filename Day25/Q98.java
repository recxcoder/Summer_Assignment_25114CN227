package Day25;

//Write a program to Find common characters in strings.

import java.util.Scanner;

public class Q98 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Write text1: ");
        String text1 = sc.nextLine().toLowerCase();

        System.out.print("Write text2: ");
        String text2 = sc.nextLine().toLowerCase();

        int[] freq = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            freq[text1.charAt(i)] = 1;
        }

        System.out.print("Common characters: ");

        for (int i = 0; i < text2.length(); i++) {
            char c = text2.charAt(i);

            if (freq[c] == 1) {
                System.out.print(c + " ");
                freq[c] = 2;
            }
        }

        sc.close();
    }
}