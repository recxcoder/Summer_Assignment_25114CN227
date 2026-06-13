package Day15;

//Write a program to Reverse array.

public class Q57 {
    public static void main(String[] args) {
        
        int[] arr = { 53, 45, 76, 53, 63, 76, 25, 56, 63, 76, 84, 53 };

        System.out.print("Reverse array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
