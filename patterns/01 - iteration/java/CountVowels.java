import java.util.Set;

/**
 * Counts the number of vowels in a string.
 *
 * Pattern: Iteration
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the string to analyze
 * @return the total number of vowels
 */
public class CountVowels {
    private static final Set<Character> VOWELS = Set.of(
            'a','e','i','o','u',
            'A','E','I','O','U'
        );

    public static int solveWithIf(String input) {

        int count = 0;

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);

            if(c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A'|| c == 'E' || c == 'I' || c == 'O' || c == 'U') {

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
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    count++;
                    break;
            }
        }

        return count;
    }

    public static int solveWithNormalization(String input) {
        
        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u') {

                count++;
            }
        }

        return count;
    }

    public static int solveWithIndexOf(String input) {

        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    public static int solveWithHashSet(String input) {
        
        int count = 0; 
        
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(VOWELS.contains(c)) {
                count++;
            }
        }

        return count;
    }
}