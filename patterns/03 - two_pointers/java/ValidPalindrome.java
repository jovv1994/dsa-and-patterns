/**
 * Checks whether a string is a valid palindrome,
 * ignoring non-alphabetic characters and letter case.
 *
 * Pattern: Two Pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @param input the string to analyze
 * @return {@code true} if the string is a valid palindrome; {@code false} otherwise
 */
public class ValidPalindrome {

    public static boolean solve(String input) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                c = Character.toLowerCase(c);
                sb.append(c);
            }
        }

        int i = 0;
        int j = sb.length() - 1;

        while(i < j) {
            if(sb.charAt(i) != sb.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}