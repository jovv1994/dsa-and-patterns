/**
 * Reverses only the letters in a string while keeping
 * non-alphabetic characters in their original positions.
 *
 * Pattern: Two Pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @param input the string to analyze
 * @return a new string with only its letters reversed
 */
public class ReverseOnlyLetters {

    public static String solve(String input) {

        int i = 0;
        int j = input.length() - 1;
        StringBuilder sb = new StringBuilder(input);

        while(i < j) {
            char ichar = sb.charAt(i);
            char jchar = sb.charAt(j);

            if(
                ((ichar >= 'a' && ichar <= 'z') || (ichar >= 'A' && ichar <= 'Z')) 
                && 
                ((jchar >= 'a' && jchar <= 'z') || (jchar >= 'A' && jchar <= 'Z'))
            ) {

                sb.setCharAt(i, jchar);
                sb.setCharAt(j, ichar);

                i++;
                j--;
            }
            
            if(!((ichar >= 'a' && ichar <= 'z') || (ichar >= 'A' && ichar <= 'Z'))) {
                i++;
            }
            
            if(!((jchar >= 'a' && jchar <= 'z') || (jchar >= 'A' && jchar <= 'Z'))) {
                j--;
            }
        }

        return sb.toString();
    }
}