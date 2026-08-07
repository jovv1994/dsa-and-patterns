/**
 * Removes all spaces from a string.
 *
 * Pattern: Iteration
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @param input the string to analyze
 * @return a new string with all spaces removed
 */
public class RemoveSpaces {

    public static String solveWithIf(String input) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c != ' ') {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static String solveWithReplace(String input) {
        return input.replace(" ", "");
    }
}