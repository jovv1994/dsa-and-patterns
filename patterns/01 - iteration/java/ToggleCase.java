/**
 * Toggles the case of every alphabetic character in a string.
 *
 * Pattern: Iteration
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @param input the string to analyze
 * @return a new string with uppercase letters converted to lowercase and vice versa
 */
public class ToggleCase {

    public static String solveWithIf(String input) {
        StringBuilder sb = new StringBuilder(input);

        for(int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

            if(c >= 'A' && c <= 'Z') {
                sb.setCharAt(i, Character.toLowerCase(c));
            } else if(c >= 'a' && c <= 'z') {
                sb.setCharAt(i, Character.toUpperCase(c));
            }

        }

        return sb.toString();
    }

    public static String solveWithCharacter(String input) {
        StringBuilder sb = new StringBuilder(input);

        for(int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

            if(Character.isUpperCase(c)) {
                sb.setCharAt(i, Character.toLowerCase(c));
            } else if(Character.isLowerCase(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }

        return sb.toString();
    }
}