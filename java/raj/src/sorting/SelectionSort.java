package sorting;

import java.util.Arrays;

/**
 * The {@code SelectionSort} class provides a static method to perform
 * selection sort on an array of integers.
 * <p>
 * This implementation modifies the original array and prints the sorted result.
 * </p>
 *
 * @author Rajendra
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {23, 12, 56, 34, 90, 14, 7, 21};
        sort(array);
    }

    /**
     * Sorts the given array using the selection sort algorithm and prints the sorted array.
     * <p>
     * This method finds the smallest element in the unsorted portion of the array
     * and swaps it with the first element in that portion, repeating until the array is sorted.
     * </p>
     *
     * @param unsortedArray the array to be sorted
     */
    static void sort(int[] unsortedArray) {
        for (int index = 0; index < unsortedArray.length - 1; index++) {
            int smallestNumber = index;
            for (int innerIndex = index + 1; innerIndex < unsortedArray.length; innerIndex++) {
                if (unsortedArray[innerIndex] < unsortedArray[smallestNumber]) {
                    smallestNumber = innerIndex;
                }
            }
            if (smallestNumber != index) {
                int temp = unsortedArray[index];
                unsortedArray[index] = unsortedArray[smallestNumber];
                unsortedArray[smallestNumber] = temp;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(unsortedArray));
    }
}
