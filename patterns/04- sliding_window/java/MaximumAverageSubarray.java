/**
* Finds the maximum average of any contiguous subarray of size k.
*
* Pattern: Sliding Window (Fixed Size)
*
* Time Complexity: O(n)
* Space Complexity: O(1)
*
* @param input the input integer array
* @param k the size of the sliding window
* @return the maximum average among all contiguous subarrays of size k
*/
public class MaximumAverageSubarray {

    public static float solve(int[] input, int k) {

        double windowSum = 0;

        for(int i = 0; i < k; i++) {
            windowSum += input[i];
        }

        double maxAverage = windowSum / k;

        for(int r = k; r < input.length; r++) {
            windowSum += input[r] - input[r - k];

            double currentAverage = windowSum / k;

            if(currentAverage > maxAverage) {
                maxAverage = currentAverage;
            }
        }

        return maxAverage;
    }
}