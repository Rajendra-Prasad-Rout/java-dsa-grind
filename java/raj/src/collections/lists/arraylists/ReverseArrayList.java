package collections.lists.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A simple example demonstrating how to reverse an ArrayList in Java.
 * <p>
 * This class creates a list of integers, prints the original list,
 * reverses it using {@link Collections#reverse(List)}, and then prints the reversed list.
 * </p>
 *
 * @author Rajendra
 */
public class ReverseArrayList {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println("Original list: " + numbers);

        Collections.reverse(numbers); // Reverses the list in place

        System.out.println("Reversed list: " + numbers);
    }
}
