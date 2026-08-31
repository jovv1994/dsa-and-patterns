/**
 * Remove duplicates from sorted array
 *
 * Pattern: Two Pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @param input the int array to analyze
 * @return a new int array without duplicates
 */
public class RemoveDuplicatesFromSortedArray {

    public static int[] solve(int[] input) {
        int i = 0;

        for(int j = 0; j < input.length; j++) {
            
            if(input[j] != input[i]) {
                i++;
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }

        int[] result = new int[i + 1];

        for(int k = 0; k <= i; k++) {
            result[k] = input[k];
        }

        return result;
    }
}