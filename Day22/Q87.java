package Day22;

//Write a program to Character frequency

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Q87 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Write text: ");
        String text = sc.nextLine();

        String lowerText = text.toLowerCase();

        Map<Character, Integer> freMap = new HashMap<>();

        for (char c : lowerText.toCharArray()) {
            if (c>= 'a' && c <='z') {
                freMap.put(c, freMap.getOrDefault(c, 0) + 1);
            }
        }
        
        System.out.println("Character frequency: ");
        for (Map.Entry<Character, Integer> entry : freMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }
}
