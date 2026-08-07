/**
 * Counts the number of words in a string.
 *
 * Pattern: Iteration
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the string to analyze
 * @return the total number of words
 */
public class CountWords {

    public static int solveWithIf(String input) {

        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c != ' ' && (i == 0 || input.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        return count;
    }

    public static int solveWithSplit(String input) {

        String[] words = input.split("[\\s+]");

        return words.length;
    }
}