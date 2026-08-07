/**
 * Counts how many times a character appears in a string.
 *
 * Pattern: Iteration
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param text the string to analyze
 * @param character the character to count
 * @return the number of occurrences of the character
 */
public class CountCharacterOccurrences {

    public static int solveWithIf(String text, char character) {
        
        int count = 0;

        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if(c == character) {
                count++;
            }
        }

        return count;
    }
}