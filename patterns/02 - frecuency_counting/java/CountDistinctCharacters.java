/**
 * Counts the number of distinct characters in a string.
 *
 * Pattern: Frequency Counting
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the string to analyze
 * @return the number of distinct characters
 */
public class CountDistinctCharacters {

    public static int solveWithArray(String input) {
        int count = 0;
        int size = 256;
        int[] frequencies = new int[size];

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            frequencies[c]++;
        }

        for(int frequency : frequencies) {
            if(frequency != 0) {
                count++;
            }
        }

        return count;
    }
}