/**
* Finds the maximum number of ones in any contiguous subarray of size k.
*
* Pattern: Sliding Window (Fixed Size)
*
* Time Complexity: O(n)
* Space Complexity: O(1)
*
* @param input the input integer array containing binary values
* @param k the size of the sliding window
* @return the maximum number of ones in any contiguous subarray of size k
*/
public class MaximumNumberOnesKLengthWindow {

    public static int solve(int[] input, int k) {

        int windowMaximumNumberOnes = 0;
        int maxOnes = 0;

        for(int i = 0; i < k; i++) {
            if(input[i] == 1) {
                maxOnes++;
            }
        }

        windowMaximumNumberOnes = maxOnes;

        for(int r = k; r < input.length; r++) {
            int rn = input[r];
            int ln = input[r - k];

            if(rn == 1) {
                windowMaximumNumberOnes++;
            }

            if(ln == 1) {
                windowMaximumNumberOnes--;
            }

            if(windowMaximumNumberOnes > maxOnes) {
                maxOnes = windowMaximumNumberOnes;
            }
        }

        return maxOnes;
    }
}