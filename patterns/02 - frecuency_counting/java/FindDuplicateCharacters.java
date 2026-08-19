/**
 * Find duplicate ASCII characters in a string.
 *
 * Pattern: Frequency Counting
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the string to analyze
 */
public class FindDuplicateCharacters {

    public static void solveWithArray(String input) {

        int size = 256;
        int[] frequencies = new int[size];

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            frequencies[c]++;
        }

        for(int i = 0; i < frequencies.length(); i++) {
            if(frequencies[i] > 1) {
                System.out.println((char)(i));
            }
        }
    }
}