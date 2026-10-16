/**
 * Finds the length of the smallest contiguous subarray whose sum is greater than
 * or equal to S.
 *
 * Pattern: Sliding Window (Variable Size)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the input integer array
 * @param S the minimum target sum
 * @return the length of the smallest contiguous subarray whose sum is greater
 *         than or equal to S
 */
public class SmallestSubarrayWithSumMajorEqualS {

    public static int solve(int[] input, int S) {

        int wSum = input[0];
        int wCurrentSize = 1;
        int wMinSize = input.length + 1;
        int r = 0;
        int l = 0;

        if(wSum >= S) {
            return wCurrentSize; 
        }

        while(r < input.length - 1) {

            r++;
            wSum += input[r];
            wCurrentSize++;

            while(wSum >= S) {
                if(wCurrentSize < wMinSize) {
                    wMinSize = wCurrentSize;
                }

                wSum -= input[l];
                wCurrentSize--;
                l++;
            }
        }
        return wMinSize;
    }
}