package Day13;

//Write a program to Find largest and smallest element.

public class Q51 {
    public static void main(String[] args) {

        int[] arr = { 32, 23, 45, 12, 64, 76, 97, 35, 84, 36 };

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }

        System.out.println("Largest element from array is: " + max);
        System.out.println("Smallest element from array is: " + min);

    }
}
