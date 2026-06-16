package Day16;

//Write a program to Remove duplicates from array.

public class Q64 {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 20, 30, 30, 40, 40, 40, 50 };
        int rd = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[rd]) {
                rd++;
                arr[rd] = arr[i];
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i <= rd; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
