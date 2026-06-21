package Day21;

// Write a program to Find string length without strlen().

public class Q81 {
    public static void main(String[] args) {
        
        String text = "I am doing my assignment.";

        int count = 0;

        for (char c : text.toCharArray()) {
            count++;
        }
        System.out.println("Lenth of the string is: " + count);
    }   
}
