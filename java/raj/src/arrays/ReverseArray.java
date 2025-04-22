package arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {13, 54, 2, 78, 43, 22, 19, 21};
        reverseInPlace(array, array.length);
        reverseWithExtraArray(array, array.length);
    }

    /**
     * Reverses the given array in-place using the two-pointer approach.
     * <p>
     * This method does not use any extra space and modifies the original array.
     *
     * @param arr the array to reverse
     * @param n   the length of the array
     */
    public static void reverseInPlace(int[] arr, int n) {
        int left = 0, right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reverserd array : " + Arrays.toString(arr));
    }

    /**
     * Reverses the given array using an auxiliary array.
     * <p>
     * The reversed content is copied back into the original array.
     *
     * @param arr the array to reverse
     * @param n   the length of the array
     */
    public static void reverseWithExtraArray(int[] arr, int n) {
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[n - 1 - i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = reversed[i];
        }
        System.out.println("Reverserd array : " + Arrays.toString(arr));
    }
}
