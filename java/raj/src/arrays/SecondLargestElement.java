package arrays;

import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] array = {13, 54, 2, 78, 43, 22, 19, 21};
        secondLargestElement(array);
        secondLargestElementOptimal(array);
    }

    /**
     * Finds and prints the second largest element in the given array.
     * <p>
     * The array is sorted in ascending order, and the largest element is identified.
     * Then, the method iterates backwards to find the next distinct smaller value.
     * If the array has fewer than 2 elements, a message is printed.
     *
     * @param nums the array of integers to process
     */
    public static void secondLargestElement(int[] nums) {
        if (nums.length < 2) {
            System.out.println("Array length can't be less than 2");
            return;
        }

        int large = 0, secondLarge = -1;
        Arrays.sort(nums);
        large = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != large) {
                secondLarge = nums[i];
                break;
            }
        }
        System.out.println("Second largest element: " + secondLarge);
    }

    /**
     * Finds and prints the second largest element in the array using a single pass.
     * <p>
     * This method iterates through the array once, keeping track of the largest
     * and second largest distinct elements without sorting.
     * <p>
     * It is more efficient than the sort-based approach, with a time complexity of O(n).
     *
     * @param array the array of integers to process
     */
    public static void secondLargestElementOptimal(int[] array) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        System.out.println("Second largest element: " + secondLargest);
    }
}
