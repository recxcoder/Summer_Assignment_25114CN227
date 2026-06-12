package Day14;

//Write a program to Second largest element. 

public class Q55 {
    public static void main(String[] args) {
        
        int[] arr = { 53, 45, 76, 23, 63, 76, 25, 56, 62, 17, 84, 84, 80, 36 };

        int largest = arr[0];
        int secondLargest = arr[1];

        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            }
            else if (i > secondLargest && i != largest ) {
                secondLargest = i;
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
