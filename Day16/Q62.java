package Day16;

//Write a program to Find maximum frequency element

public class Q62 {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 9, 5, 4, 3, 5, 9, 7};

       System.out.println("Maximum frequency element is: " + maxFrequency(arr));
        
    }
    public static int maxFrequency(int[] arr) {
        int maxFreq = 0;
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int freq = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }
            if (freq > maxFreq) {
                maxFreq = freq;
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
}
