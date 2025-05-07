package sorting;

import java.util.Arrays;

/**
 * The {@code BubbleSort} class provides a static method to perform
 * bubble sort on an array of integers.
 * <p>
 * This implementation sorts the array in-place and prints the sorted result.
 * </p>
 *
 * @author Rajendra
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {23, 48, 10, 22, 39, 7, 18};
        sort(array);
    }

    /**
     * Sorts the given array using the bubble sort algorithm and prints the sorted array.
     * <p>
     * This method compares adjacent elements and swaps them if they are in the wrong order.
     * It continues to iterate over the array until all elements are sorted.
     * </p>
     *
     * @param array the array to be sorted
     */
    static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int smaller = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = smaller;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
