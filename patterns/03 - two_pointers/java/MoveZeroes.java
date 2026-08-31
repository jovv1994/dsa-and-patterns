/**
 * Moves all zeroes to the end of an array while maintaining
 * the relative order of non-zero elements.
 *
 * Pattern: Two Pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param input the int array to modify
 * @return the modified array with all zeroes at the end
 */
public class MoveZeroes {

    public static int[] solve(int[] input) {
        int i = 0;
        
        for(int j = 0; j < input.length; j++) {
            if(input[j] != 0) {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;

                i++;
            }
        }

        return input;
    }
}