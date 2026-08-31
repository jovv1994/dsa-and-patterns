/**
 * Checks whether one string is a subsequence of another string.
 *
 * Pattern: Two Pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the string to search
 * @param sub the string to check as a subsequence
 * @return {@code true} if {@code sub} is a subsequence of {@code input};
 *         {@code false} otherwise
 */
public class IsSubsequence {

    public static boolean solve(String input, String sub) {

        int i = 0;
        int j = 0;

        if(input.length() == 0 || sub.length() == 0) {
            return false;
        }

        while(i < input.length()) {
            if(input.charAt(i) == sub.charAt(j)) {
                j++;
            }

            if(j == sub.length()) {
                return true;
            }

            i++;
        }

        return false;
    }
}