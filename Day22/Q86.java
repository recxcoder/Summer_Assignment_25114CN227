package Day22;

///Write a program to Count words in a sentence.

import java.util.Scanner;
public class Q86 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Write sentence: ");
        String text = sc.nextLine().strip();

        if (text.isEmpty()) {
            System.out.println(text + " has no words.");
            sc.close();
            return;
        }

        int count = 0;

        for (char c : text.toCharArray()) {
            if (c == 32) {
                count++;
            }
        }

        System.out.println("\"" + text + "\" contains " + (count + 1) + " words");

        sc.close();
    }
}

// There is a bug in this code, if user accidently entered more than one spaces in-between the sentences, it will count all of them.
