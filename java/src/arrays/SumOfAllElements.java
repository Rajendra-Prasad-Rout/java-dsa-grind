package arrays;

/**
 * The {@code SumOfAllElements} class provides a simple example
 * of how to calculate the sum of all elements in an integer array.
 * <p>
 * This program initializes an array of integers and computes
 * the total sum using an enhanced for-loop.
 * </p>
 *
 * Example output:
 * <pre>
 * Sum of all elements: 15
 * </pre>
 *
 * @author Rajendra
 */
public class SumOfAllElements {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
