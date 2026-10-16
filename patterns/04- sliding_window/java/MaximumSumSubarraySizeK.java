/**
* Finds the maximum sum of any contiguous subarray of size k.
*
* Pattern: Sliding Window (Fixed Size)
*
* Time Complexity: O(n)
* Space Complexity: O(1)
*
* @param input the input integer array
* @param k the size of the sliding window
* @return the maximum sum among all contiguous subarrays of size k
*/
public class MaximumSumSubarraySizeK {

    public static int solve(int[] input, int k) {

        int windowSum = 0;
        int max = 0;

        for(int i = 0; i < k; i++) {
            windowSum += input[i];
        }

        max = windowSum;

        for(int r = k; r < input.length; r++) {
            windowSum += input[r] - input[r - k];

            if(windowSum > max) {
                max = windowSum;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(solve(new int[]{2,1,5,1,3,2}, 3));

    }
}