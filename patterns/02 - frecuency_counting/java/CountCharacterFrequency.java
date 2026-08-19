/**
 * Count lower and upper letters frequency.
 *
 * Pattern: Count Frequency
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the string to analyze
 * @return void
 */
public class CountCharacterFrequency {

    public static void solveWithArray(String input) {

        int size = 26;
        int[] lowerFrequency = new int[size];
        int[] upperFrequency = new int[size];

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c >= 'a' && c <= 'z') {
                lowerFrequency[c - 'a']++;
            } else if(c >= 'A' && c <= 'Z') {
                upperFrequency[c - 'A']++;
            }
        }

        for(int i = 0; i < size; i++) {
            int lowerCount = lowerFrequency[i];
            int upperCount = upperFrequency[i];

            if(lowerCount > 0) {
                System.out.println((char)(i + 'a') + '=' + lowerCount);
            }

            if(upperFrequency[i] > 0) {
                System.out.println((char)(i + 'A') + '=' + upperCount);
            }
        }
    }
}