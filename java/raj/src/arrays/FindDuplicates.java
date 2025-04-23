package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A class demonstrating methods to find duplicate numbers in an array.
 * Includes a brute-force approach and a more efficient Set-based solution.
 *
 * @author Rajendra
 */
public class FindDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};
        List<Integer> duplicateElementsBruteForce = findDuplicatesBruteForce(nums);
        Set<Integer> duplicateElementsUsingSet = findDuplicatesUsingSet(nums);
        System.out.println("Duplicates found (brute-force): " + duplicateElementsBruteForce);
        System.out.println("Duplicates found (using-set): " + duplicateElementsUsingSet);
    }

    /**
     * Finds duplicate numbers in an array using a brute-force method.
     * Time: O(n^2), Space: O(k) where k is the number of unique duplicates.
     *
     * @param arr The input integer array.
     * @return List of unique duplicate numbers.
     */
    public static List<Integer> findDuplicatesBruteForce(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                    duplicates.add(arr[i]);
                }
            }
        }
        return duplicates;
    }

    /**
     * Finds duplicate numbers in an array using a HashSet.
     * Time: O(n), Space: O(m) where m is the number of unique elements.
     *
     * @param arr The input integer array.
     * @return Set of unique duplicate numbers.
     */
    public static Set<Integer> findDuplicatesUsingSet(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }
}