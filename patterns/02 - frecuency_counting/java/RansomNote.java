/**
 * Checks whether a ransom note can be constructed from the characters
 * available in a magazine string.
 *
 * Pattern: Frequency Counting
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input1 the string to construct
 * @param input2 the string containing the available characters
 * @return {@code true} if the ransom note can be constructed;
 *         {@code false} otherwise
 */
public class RansomNote {

    public static boolean solveWithArray(String input1, String input2) {

        int size = 256;
        int[] frequencies = new int[size];

        for(int i = 0; i < input2.length(); i++) {
            frequencies[input2.charAt(i)]++;
        }

        for(int i = 0; i < input1.length(); i++) {
            frequencies[input1.charAt(i)]--;

            if(frequencies[input1.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }
}