/**
 * Compares two strings character by character.
 *
 * Pattern: Iteration
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input1 the first string
 * @param input2 the second string
 * @return {@code true} if both strings are equal; {@code false} otherwise
 */
public class CompareStrings {

    public static boolean myEquals(String input1, String input2) {
        if(input1.length() != input2.length()) {
            return false;
        }

        for(int i = 0; i < input1.length(); i++) {
            if(input1.charAt(i) != input2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}