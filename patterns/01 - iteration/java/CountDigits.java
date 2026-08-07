import java.util.Set;

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

public class CountDigits {
    private static final Set<Character> DIGITS = Set.of(
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
        );

    public static int solveWithIf(String input) {
        
        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c == '0' || 
               c == '1' || 
               c == '2' || 
               c == '3' || 
               c == '4' || 
               c == '5' ||
               c == '6' ||
               c == '7' ||
               c == '8' ||
               c == '9') {

                count++;
               }
        }

        return count;
    }

    public static int solveWithSwitch(String input) {
        
        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    count++;
                    break;
            }
        }

        return count;
    }

    public static int solveWithIndexOf(String input) {

        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if("0123456789".indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    public static int solveWithHashSet(String input) {

        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(DIGITS.contains(c)) {
                count++;
            }
        }

        return count;
    }

    public static int solveWithCharacter(String input) {
        
        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            char c = input.chatAt(i);

            if(Character.isDigit(c)) {
                count++;
            }
        }

        return count;
    }
}