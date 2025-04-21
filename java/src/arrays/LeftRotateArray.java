package arrays;

import java.util.Arrays;

/**
 * Utility class for performing array rotations.
 */
public class LeftRotateArray {

    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 1, 5};
        System.out.println("Original Array : " + Arrays.toString(numbers));
        leftRotateArray(numbers);
    }

    /**
     * Performs a single left rotation on the given array.
     * <p>
     * This method shifts each element of the array one position to the left,
     * and the first element is moved to the end of the array.
     * The rotation is done in-place and the updated array is printed.
     *
     * @param nums the array of integers to rotate
     */
    public static void leftRotateArray(int[] nums) {
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;

        System.out.println("Left Rotate Array : " + Arrays.toString(nums));
    }
}
