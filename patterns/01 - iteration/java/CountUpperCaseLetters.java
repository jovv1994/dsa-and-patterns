/**
 * Counts the number of uppercase letters in a string.
 *
 * Pattern: Iteration
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the string to analyze
 * @return the total number of uppercase letters
 */
public class CountUpperCaseLetters {
    public static int solveWithCharacter(String input) {

        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c == Character.isUpperCase(c)) {
                count++;
            }
        }

        return count;
    }

    public static int solveWithIfRange(String input) {

        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c >= 'A' && c <= 'Z') {
                count++;
            }
        }

        return count;
    }
}