package Day21;

// Write a program to Reverse a string.

public class Q82 {
    public static void main(String[] args) {
        
        String text = "Hello everyone!";

        char[] chars = text.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        
        while(left<right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            left++;
            right--;
        }
        
        String reversed = new String(chars);
        System.out.print("Reverse of " + text + " is: " + reversed);
    }
}
