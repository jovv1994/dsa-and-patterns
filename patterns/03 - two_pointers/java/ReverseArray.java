/**
 * Reverses an array in-place..
 *
 * Pattern: Two pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the int array
 * @return the int array reversed
 */
public class ReverseArray {

    public static int[] solve(int[] input) {

        int i = 0,
        int j = input.length - 1;

        while(i < j) {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;

            i++;
            j--;
        }

        return input;
    }
}