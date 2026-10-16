/**
 * Finds the length of the longest substring containing at most K distinct characters.
 *
 * Pattern: Sliding Window (Variable Size)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the input string containing lowercase English letters
 * @param K the maximum number of distinct characters allowed
 * @return the length of the longest substring containing at most K distinct characters
 */
public class LongestSubstringWithAtMostKCharacters {

    public static int solve(String input, int K) {
        /*s = "eceba"
        s = "aababcccccaddeeff"*/

        int l = 0, wMaxSize = 0, wK = 0;
        int[] frequency = new int[26];

        if(input.length() == 0) {
            return 0;
        }
        
        for(int r = 0; r < input.length(); r++) {
            char c = input.charAt(r);
            if(frequency[c - 'a'] == 0) {
                wK++;
            }
            frequency[c - 'a']++;

            while(wK > K) {
                c = input.charAt(l);
                frequency[c - 'a']--;
                l++;
                if(frequency[c - 'a'] == 0) {
                    wK--;
                }
            }

            if((r - l + 1) > wMaxSize) {
                wMaxSize = r - l + 1;
            }
        }

        return wMaxSize;
    }
}