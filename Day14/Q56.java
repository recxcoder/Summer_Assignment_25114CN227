package Day14;

//Write a program to Find duplicates in array.

public class Q56 {
    public static void main(String[] args) {
        
        int[] arr = { 53, 45, 76, 53, 63, 76, 25, 56, 63, 76, 84, 53 };

        System.out.print("Duplicates elements are: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
