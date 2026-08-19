/**
 * Finds the first non-repeated character in a string.
 *
 * Pattern: Frequency Counting
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the string to analyze
 * @return the first non-repeated character, or '#' if none exists
 */
public class FirstNonRepeatedCharacter {

    public static char solveWithArray(String input) {

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

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c >= 'a' && c <= 'z') {
                if(lowerFrequency[c - 'a'] == 1) {
                    return c;
                }
            } else if(c >= 'A' && c <= 'Z') {
                if(upperFrequency[c - 'A'] == 1) {
                    return c;
                }
            }
        }

        return '#';
    }
}