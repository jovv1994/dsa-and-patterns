/**
 * Find the most frequent character in a string.
 *
 * Pattern: Frequency Counting
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the string to analyze
 * @return the most frequent character
 */
public class MostFrequentCharacter {

    public static int solveWithArray(String input) {

        int max = 0;
        char mfc = '';
        int size = 256;
        int[] frequencies = new int[size];

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            frequencies[c]++;
        }

        for(int i = 0; i < frequencies.length(); i++) {
            if(frequencies[i] > max) {
                max = frequencies[i];
                mfc = (char)(i);
            }
        }

        return mfc;
    }
}