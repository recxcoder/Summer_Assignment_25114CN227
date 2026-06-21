package Day21;

// Write a program to Count vowels and consonants.

public class Q83 {
    public static void main(String[] args) {

        String text = "I am doing my assignment.";

        int CountVowels = 0;
        int countConsonant = 0;

        String lowerText = text.toLowerCase();

        for (char c : lowerText.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    CountVowels++;
                } else {
                    countConsonant++;
                }
            }
        }
        System.out.println("\"" + text + "\" contains " + CountVowels + " vowels and " + countConsonant + " consonants");
    }
}
