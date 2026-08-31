/**
 * Reverse a string.
 *
 * Pattern: Two pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @param input the string to analyze
 * @return a new string with its characters reversed
 */
public class ReverseString {

    public static String solve(String input) {

        int i = 0;
        int j = input.length() - 1;
        StringBuilder sb = new StringBuilder(input);

        while(i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            i++;
            j--;
        }

        return sb.toString();
    }
}