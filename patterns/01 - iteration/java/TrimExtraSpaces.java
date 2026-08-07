/**
 * Trim extra spaces in a string.
 *
 * Pattern: Iteration
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @param input the string to analyze
 * @return a string without extra spaces
 */
public class TrimExtraSpaces {

    public static String solveWithIf(String input) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c != ' ') {
                sb.append(c);
            }else if(sb.length() > 0 && sb.charAt(sb.length() - 1) != ' ') {
                sb.append(' ');
            }    
        }

        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
            sb.setLength(sb.length() - 1);
        }

        return sb.toString();
    }
}