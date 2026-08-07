/**
 * Counts the number of digits in a string.
 *
 * Pattern: Iteration
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the string to analyze
 * @return the total number of digits
 */
public class ReverseOnlyLetters {

    public static String solve(String input) {

        StringBuilder sb = new StringBuilder(input);

        int left = 0;
        int right = input.lenght() - 1;

        while(left < right) {
            leftC = sb.charAt(left);
            rightC = sb.charAt(right);

            if((leftC >= 'a' && leftC <= 'z') || (leftC >= 'A' && leftC <= 'Z') && 
               (rightC >= 'a' && rightC <= 'z') || (rightC >= 'A' && rightC <= 'Z')) {

                sb.replace;
            }

        }

        char[] reverse = new char[input.length()];

        for(int i = 0; i < input.lenth(); i++) {
            char c = input.charAt(i);

            if(!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                reverse[i] = c;
            } else {
                reverse[i] = '';
            }
        }

        Ho8L8a

        ao8L8H

        for(int)
    }
}