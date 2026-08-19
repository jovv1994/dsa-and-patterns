/**
 * Checks whether two strings are valid anagrams.
 *
 * Pattern: Frequency Counting
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input1 the first string to analyze
 * @param input2 the second string to analyze
 * @return {@code true} if both strings contain the same character frequencies;
 *         {@code false} otherwise
 */
public class ValidAnagram {

    public static boolean solveWithArray(String input1, String input2) {
        
        int size = 26;
        int[] frequencies = new int[size];

        if(input1.length() != input2.length()) {
            return false;
        }

        for(int i = 0; i < input1.length(); i++) {

            char c1 = Character.toLowerCase(input1.charAt(i));
            char c2 = Character.toLowerCase(input2.charAt(i));

            frequencies[c1 - 'a']++;
            frequencies[c2 - 'a']--;
        }

        for(int i = 0; i < size; i++) {
            if(frequencies[i] != 0) {
                return false;
            }
        }

        return true;
    }
}