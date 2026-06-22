package Day22;

//Write a program to Remove spaces from string.

import java.util.Scanner;
public class Q88 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the sentence: ");
        String text = sc.nextLine();

        String replacedText = text.replace(" ", "");

        System.out.print("Sentence after removing spaces: " + replacedText);

        sc.close();
    }
}
