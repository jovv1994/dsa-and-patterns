/**
 * Finds the last occurrence of a character in a string.
 *
 * Pattern: Iteration
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param text the string to analyze
 * @param character the character to search for
 * @return the index of the last occurrence, or -1 if the character is not found
 */
public class FindLastOccurrence {

    public static int solveWithIf(String text, char character) {

        for(int i = text.length() - 1; i >= 0; i--) {
            char c = text.charAt(i);

            if(c == character) {
                return i;
            }
        }

        return -1;
    }
}