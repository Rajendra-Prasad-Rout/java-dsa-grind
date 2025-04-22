package arrays;

import java.util.Arrays;

public class MaxMinArray {

    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 1, 5};
        withBuiltInMethods(numbers);
        withoutBuiltInMethods(numbers);
    }

    /**
     * Finds and prints the largest and smallest elements in the given array
     * using Java's built-in {@link Arrays#sort(int[])} method.
     *
     * @param array the array of integers to be processed
     */
    static void withBuiltInMethods(int[] array) {
        Arrays.sort(array);
        System.out.println("[withBuiltInMethods] Largest element: " + array[array.length - 1]);
        System.out.println("[withBuiltInMethods] Smallest element: " + array[0]);
    }

    /**
     * Finds and prints the largest and smallest elements in the given array
     * without using any built-in sorting methods.
     *
     * @param array the array of integers to be processed
     */
    static void withoutBuiltInMethods(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("[withoutBuiltInMethods] Largest element: " + max);
        System.out.println("[withoutBuiltInMethods] Smallest element: " + min);
    }
}
