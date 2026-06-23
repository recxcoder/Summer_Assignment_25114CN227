package Day25;

//Write a program to Sort words by length.

import java.util.Scanner;
public class Q100 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("How many names: ");
        int num = sc.nextInt();

        sc.nextLine();

        String[] words = new String[num];
        
        for (int i = 0; i < num; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            words[i] = sc.nextLine();
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                if (words[j].length() > words[j+1].length()) {
                    swap(words, j, j+1);
                }
            }
        }

        for (String word : words) {
            System.out.println(word);
        }
        sc.close();
    }
    public static void swap(String[] word, int a, int b){
        String temp = word[a];
        word[a] = word[b];
        word[b] = temp;
    }
}