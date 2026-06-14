package Day16;

//Write a program to Find missing number in array.

public class Q61 {
    public static void main(String[] args) {
        
        int[] arr = {2,3,1,5};
        int n = 5;

        int missingNumber = findMissingNumber(arr, n);

        System.out.println("Missing number from array is: " + missingNumber);
    }
    public static int findMissingNumber(int[] arr, int n){
        int expectedSum = n * (n+1) / 2;

        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }
}