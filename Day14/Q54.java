package Day14;

//Write a program to Frequency of an element
// Frequency is how many time an element appears in array

public class Q54 {
    public static void main(String[] args) {

        int[] arr = { 2, 5, 3, 3, 7, 2, 7, 4, 1, 8, 9, 4, 3, 0, 8, 5 };

        int target = 8;

        int count = 0;

        for (int i : arr) {
            if (i == target) {
                count++;
            }
        }
        System.out.println("Frequency of " + target + " is: " + count);
    }
}
