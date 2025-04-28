package strings;

import java.util.Arrays;
import java.util.Vector;

public class ReverseString {

    public static void main(String[] args) {
        String hello = "hello";
        reverseStringBruteForce(hello);

        Vector<Character> str = new Vector<>(Arrays.asList('h', 'e', 'l', 'l', 'o'));
        reverseStringOptimal(str);
    }

    /**
     * Reverses a string using brute force by iterating from the end
     * and concatenating each character to form the reversed string.
     *
     * @param string the input string to be reversed
     */
    static void reverseStringBruteForce(String string) {
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse.concat(String.valueOf(string.charAt(i)));
        }
        System.out.println("Reverse String Brute Force: " + reverse);
    }

    /**
     * Reverses a string represented as a {@link Vector} of characters
     * using the two-pointer approach for optimal performance.
     *
     * @param characters the vector of characters to be reversed
     */
    static void reverseStringOptimal(Vector<Character> characters) {
        int start = 0, end = characters.size() - 1;

        while (start < end) {
            char ch = characters.get(start);
            characters.set(start, characters.get(end));
            characters.set(end, ch);

            start++;
            end--;
        }

        System.out.print("Reverse String Optimal: ");
        for (char c : characters) {
            System.out.print(c);
        }
    }

}
