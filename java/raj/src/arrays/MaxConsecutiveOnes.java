package arrays;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0};
        findMaxConsecutiveOnes(array);
    }

    /**
     * Finds and prints the maximum number of consecutive 1s in a binary array.
     * <p>
     * This method iterates through the array and keeps track of the current
     * count of consecutive 1s. Whenever a 0 is encountered, the count is reset.
     * The maximum value encountered during this process is printed.
     *
     * @param array the binary array (containing only 0s and 1s)
     */
    public static void findMaxConsecutiveOnes(int[] array) {
        int count = 0, max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        System.out.println("Max consecutive ones: " + max);
    }
}
