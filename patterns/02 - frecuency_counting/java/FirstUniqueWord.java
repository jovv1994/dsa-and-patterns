import java.util.Map;
import java.util.HashMap;

/**
 * Finds the first unique word in a sentence.
 *
 * Pattern: Frequency Counting
 *
 * Time Complexity: O(n)
 * Space Complexity: O(k), where k is the number of distinct words
 *
 * @param input the string to analyze
 * @return the first word that appears exactly once, or an empty string if none exists
 */
public class FirstUniqueWord {

    public static String solveWithHashMap(String input) {

        Map<String, Integer> frequencies = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                sb.append(c);
            } else {
                if(sb.length() > 0) {
                    frequencies.put(
                        sb.toString(),
                        frequencies.getOrDefault(sb.toString(), 0) + 1
                    );

                    sb.setLength(0);
                }
            }
        }

        if(sb.length() > 0){
            frequencies.put(
                sb.toString(),
                frequencies.getOrDefault(sb.toString(), 0) + 1
            );

            sb.setLength(0);
        }

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                sb.append(c);
            } else {
                if(sb.length() > 0 && frequencies.get(sb.toString()) == 1) {
                    return sb.toString();
                }
            }
        }

        if(sb.length() > 0){
            if(frequencies.get(sb.toString()) == 1) {
                return sb.toString();
            }
        }

        return "";
    }
}