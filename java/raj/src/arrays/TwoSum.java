package arrays;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] array = {1, 5, 8, 2, 4, 9, 7};
        int target = 8;
        twoSumBruteForce(array, target);
    }

    /**
     * Finds a pair of numbers in the given array that sum up to the target value using a brute-force approach.
     * This method iterates through all possible pairs of numbers in the array.
     *
     * @param arr    The input array of integers.
     * @param target The target sum to find.
     */
    static void twoSumBruteForce(int[] arr, int target) {
        int[] result = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                }
            }
        }
        System.out.println("Answer: " + Arrays.toString(result));
    }

}