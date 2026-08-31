/**
 * Checks whether a string is a palindrome.
 *
 * Pattern: Two Pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the string to analyze
 * @return {@code true} if the string is a palindrome; {@code false} otherwise
 */
public class PalindromeCheck {

    public static boolean solve(String input) {

        int i = 0;
        int j = input.length() - 1;

        while(i < j) {
            if(input.charAt(i) != input.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}