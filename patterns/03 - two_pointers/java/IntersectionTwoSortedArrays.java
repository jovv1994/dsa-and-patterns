/**
 * Finds the intersection of two sorted arrays.
 *
 * Pattern: Two Pointers
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(min(n, m))
 *
 * @param input1 the first sorted int array
 * @param input2 the second sorted int array
 * @return an array containing the common elements
 */
public class IntersectionTwoSortedArrays {

    public static int[] solve(int[] input1, int[] input2) {

        int i = 0;
        int j = 0;
        int k = 0;
        int size;

        if(input1.length <= input2.length) {
            size = input1.length;
        } else {
            size = input2.length;
        }

        int[] intersection = new int[size];

        while(i < input1.length && j < input2.length) {
            if(input1[i] > input2[j]) {
                j++;
            } else if(input2[j] > input1[i]) {
                i++;
            } else {
                intersection[k] = input1[i];
                i++;
                j++;
                k++;
            }
        }

        return intersection;
    }
}