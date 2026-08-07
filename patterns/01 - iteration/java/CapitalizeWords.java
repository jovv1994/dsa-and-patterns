/**
 * Capitalizes the first letter of every word in a string.
 *
 * Pattern: Iteration
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @param input the string to analyze
 * @return a new string with each word capitalized
 */
public class CapitalizeWords {

    public static String solveWithIf(String input) {
        StringBuilder sb = new StringBuilder(input);

        for(int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

            if(c != ' ' && (i == 0 || sb.charAt(i - 1) == ' ')) {
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }

        return sb.toString();
    }
}