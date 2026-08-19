import java.util.HashMap;
import java.util.Map;

/**
 * Counts the frequency of each word in a sentence.
 *
 * Pattern: Frequency Counting
 *
 * Time Complexity: O(n)
 * Space Complexity: O(k), where k is the number of distinct words
 *
 * @param input the string to analyze
 */
public class WordFrequency {

    public static void solveWithHashMap(String input) {

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

        if(sb.length() > 0) {
            frequencies.put(
                sb.toString(),
                frequencies.getOrDefault(sb.toString(), 0) + 1
            );
        }

        for(Map.Entry<String, Integer> entry : frequencies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}