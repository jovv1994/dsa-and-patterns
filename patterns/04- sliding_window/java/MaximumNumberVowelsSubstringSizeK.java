/**
* Finds the maximum number of vowels in any substring of size k.
*
* Pattern: Sliding Window (Fixed Size)
*
* Time Complexity: O(n)
* Space Complexity: O(1)
*
* @param input the input string
* @param k the size of the sliding window
* @return the maximum number of vowels in any substring of size k
*/
public class MaximumNumberVowelsSubstringSizeK {

    public static int solve(String input, int k) {

        int windowMaximumNumberVowels = 0;
        int maxVowels = 0;

        for(int i = 0; i < k; i++) {
            char c = input.charAt(i);
            if("aeiouAEIOU".indexOf(c) != -1) {
                maxVowels++;
            }
        }

        windowMaximumNumberVowels = maxVowels;

        for(int r = k; r < input.length(); r++) {
            char rc = input.charAt(r);
            char lc = input.charAt(r - k);

            if("aeiouAEIOU".indexOf(rc) != -1) {
                windowMaximumNumberVowels++;
            }

            if("aeiouAEIOU".indexOf(lc) != -1) {
                windowMaximumNumberVowels--;
            }

            if(windowMaximumNumberVowels > maxVowels) {
                maxVowels = windowMaximumNumberVowels;
            }
        }

        return maxVowels;
    }
}