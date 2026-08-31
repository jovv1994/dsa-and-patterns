
/**
 * Finds two numbers in a sorted array whose sum equals the target.
 *
 * Pattern: Two Pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the sorted int array to analyze
 * @param target the target sum
 * @return an array containing the two numbers, or {@code null} if no pair exists
 */
public class TwoSum {
    
    public static int[] solve(int[] input, int target) {

        int i = 0;
        int j = input.length - 1;
        int sum = 0;

        while(i < j) {
            sum = input[i] + input[j];

            if(sum > target) {
                j--;
            } else if(sum < target){
                i++;
            } else {
                return new int[]{input[i], input[j]};
            }
        }

        return null;
    }
}