/**
 * Checks whether a character array is symmetric.
 *
 * Pattern: Two Pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the character array to analyze
 * @return {@code true} if the array is symmetric; {@code false} otherwise
 */
public class CheckSymmetry {

    public static boolean solve(char[] input) {

        int i = 0;
        int j = input.length - 1;

        while(i < j) {
            if(input[i] != input[j]) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}