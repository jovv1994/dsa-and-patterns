/**
 * Finds the length of the longest contiguous subarray whose sum is less than
 * or equal to K.
 *
 * Pattern: Sliding Window (Variable Size)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the input integer array
 * @param K the maximum allowed subarray sum
 * @return the length of the longest contiguous subarray whose sum is less than
 *         or equal to K
 */
public class LongestSubarrayWithSumMinorEqualK {

    public static int solve(int[] input, int K) {

        int wSum = 0, wCurrentSize = 0, wMaxSize = 0, r = 0, l = 0;

        while(r < input.length) {

            wSum += input[r];
            wCurrentSize++;
            r++;

            while(wSum > K) {
                wSum -= input[l];
                l++;
                wCurrentSize--;
            }

            if(wCurrentSize > wMaxSize) {
                wMaxSize = wCurrentSize;
            }
        }

        return wMaxSize;
    }

    public static void main(String[] args) {

}