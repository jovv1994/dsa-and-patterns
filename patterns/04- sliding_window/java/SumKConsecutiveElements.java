/**
* Calculates the sum of every contiguous subarray of size k.
*
* Pattern: Sliding Window (Fixed Size)
*
* Time Complexity: O(n)
* Space Complexity: O(n)
*
* @param input the input integer array
* @param k the size of the sliding window
* @return an array containing the sum of each contiguous subarray of size k
*/
public class SumKConsecutiveElements {

    public static int[] solve(int[] input, int k) {

        int[] result = new int[k+1];
        int windowSum = 0;

        for(int i = 0; i < k; i++) {
            windowSum += input[i];
        }

        for(int r = k; r < input.length; r++) {
            result[r - k] = windowSum;
            windowSum += input[r] - input[r - k];
        }

        result[k] = windowSum;

        return result;
    }
}