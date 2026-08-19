import java.util.HashMap;
import java.util.Map;

/**
 * Finds all words with the highest frequency in a sentence.
 *
 * Pattern: Frequency Counting
 *
 * Time Complexity: O(n)
 * Space Complexity: O(k), where k is the number of distinct words
 *
 * @param input the string to analyze
 */
public class MostFrequentWord {

    public static void solveWithHashMap(String input) {

        Map<String, Integer> frequencies = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        Integer maxValue = null;

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
            if(maxValue == null || entry.getValue() > maxValue) {
                maxValue = entry.getValue();
            }
        }

        System.out.println("The most frequent words are:");

        for(Map.Entry<String, Integer> entry : frequencies.entrySet()) {
            if(entry.getValue() == maxValue) {
                System.out.println(entry.getKey());
            }
        }

    }
}