/**
 * Find the least frequent character in a string.
 *
 * Pattern: Frequency Counting
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the string to analyze
 * @return the least frequent character
 */
public class LeastFrequentCharacter {

    public static int solveWithArray(String input) {

        char lfc = '';
        int size = 256;
        int[] frequencies = new int[size];

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            frequencies[c]++;
        }

        int min = frequencies[input.charAt(0)];

        for(int i = 0; i < frequencies.length(); i++) {
            if(frequencies[i] > 0 && frequencies[i] < min) {
                min = frequencies[i];
                lfc = (char)(i);
            }
        }

        return lfc;
    }
}