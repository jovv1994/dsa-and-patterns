/**
 * Merges two sorted arrays into a single sorted array.
 *
 * Pattern: Two Pointers
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 *
 * @param input1 the first sorted int array
 * @param input2 the second sorted int array
 * @return a new sorted array containing all elements from both arrays
 */
public class MergeTwoSortedArrays {

    public static int[] solve(int[] input1, int[] input2) {

        int size = input1.length + input2.length;

        int[] mergeArray = new int[size];

        int i = 0;
        int j = 0;

        for(int k = 0; k < size; k++) {
            if((i < input1.length) && (j < input2.length)) {
                if(input1[i] <= input2[j]) {
                    mergeArray[k] = input1[i];
                    i++;
                } else {
                    mergeArray[k] = input2[j];
                    j++;
                }
            } else if(i < input1.length) {
                mergeArray[k] = input1[i];
                i++;
            } else if(j < input2.length) {
                mergeArray[k] = input2[j];
                j++;
            }
        }

        return mergeArray;
    }

    public static void main(String[] args) {
        int[] result = solve(new int[]{1,2,3,15,50,78,99,100,200,300,400}, new int[]{1,11,12,14,25,800,900});
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}