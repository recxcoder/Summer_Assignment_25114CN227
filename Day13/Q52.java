package Day13;

//Write a program to Count even and odd elements.

public class Q52 {
    public static void main(String[] args) {

        int[] arr = { 35, 75, 43, 76, 23, 73, 24, 86, 15, 89, 98, 5, 54, 76, 18 };

        int countEven = 0;
        int countOdd = 0;

        for (int i : arr) {
            if ((i & 1) == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Number of Even element in array are: " + countEven);
        System.out.println("Number of Odd element in array are: " + countOdd);
    }
}
