/**
 * Finds the longest word in a string.
 *
 * Pattern: Iteration
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @param input the string to analyze
 * @return the longest word in the string
 */
public class LongestWord {

    public static String solveWithIf(String input) {

        StringBuilder sb = new StringBuilder();
        int longest = 0;
        String longestWord = "";

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c != ' ') {
                sb.append(c);
            } else if(sb.length() > longest) {
                longest = sb.length();
                longestWord = sb.toString();
                sb.setLength(0);
            } else if(sb.length() > 0){
                sb.setLength(0);
            }
        }

        if(sb.length() > longest) {
            longestWord = sb.toString();
        }

        return longestWord;
    }

    public static String solveWithSplit(String input) {

        int longest = 0;
        String longestWord = "";
        String[] words = input.split("\\s+");

        for(String word: words) {
            if(word.length() > longest) {
                longest = word.length();
                longestWord = word;
            }
        }

        return longestWord;
    }
}