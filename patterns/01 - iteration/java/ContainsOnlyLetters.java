/**
 * Checks whether a string contains only alphabetic letters.
 *
 * Pattern: Iteration
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the string to analyze
 * @return {@code true} if every character is a letter; {@code false} otherwise
 */
public class ContainsOnlyLetters {

    public static boolean solveWithIfRange(String input) {

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))) {
                return false;
            }
        }

        return true;
    }

    public static boolean solveWithCharacter(String input) {

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(!Character.isLetter(c)) {
                return false;
            }
        }

        return true;
    }
}