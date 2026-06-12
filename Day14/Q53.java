package Day14;

// Write a program to Linear search.

public class Q53 {
    public static void main(String[] args) {

        int[] arr = { 53, 45, 76, 23, 63, 76, 25, 56, 62, 17, 84, 36 };

        int key = 25;
        int keyAtIndex = -1;

        System.out.print(key + " is at index: ");
        
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                keyAtIndex = i;
                System.out.println(keyAtIndex);
            }
        }

    }
}
