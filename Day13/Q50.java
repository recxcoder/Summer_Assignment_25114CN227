package Day13;

//Write a program to Find sum and average of array.

public class Q50 {
    public static void main(String[] args) {

        int[] arr = { 3, 5, 7, 8, 14, 46, 23, 54 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        int avg = sum/arr.length;

        System.out.println("Sum of element of array is: " + sum);
        System.out.println("Average of element of array is:" + avg);
    }
}
