package collections.lists.arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates basic operations on an ArrayList in Java.
 * <p>
 * This class covers various ArrayList methods such as add, get, set, remove, contains etc.
 * </p>
 *
 * @author Rajendra
 */
public class ArrayListBasics {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println();
        System.out.println("Original ArrayList: " + fruits); // [Apple, Banana, Mango]

        fruits.add(0, "Kiwi");

        System.out.println("ArrayList after insert at 1st place: " + fruits); // [Kiwi, Apple, Banana, Mango]
        System.out.println("Get element from a particular index, e.g - 1: " + fruits.get(1)); // Apple

        fruits.set(2, "Grapes");
        System.out.println("ArrayList after updating a particular index, e.g - 2 (Currently 'Banana'): " + fruits); // [Kiwi, Apple, Grapes, Mango]

        fruits.remove(3);
        System.out.println("ArrayList after removing an element from a particular index, e.g - 3: " + fruits); // [Kiwi, Apple, Grapes]

        System.out.println("Find a particular item from the ArrayList (e.g - 'Grapes'): " +
                (fruits.contains("Grapes") ? "Found" : "Not Found")
        ); // Found

        Collections.reverse(fruits);
        System.out.println("ArrayList after reverse: " + fruits); // [Grapes, Apple, Kiwi]

        Collections.sort(fruits);
        System.out.println("ArrayList after being sorted in ascending order: " + fruits); // [Apple, Grapes, Kiwi]

        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("ArrayList after being sorted in descending order: " + fruits); // [Kiwi, Grapes, Apple]

        System.out.println("Size of the ArrayList: " + fruits.size()); // 3

        ArrayList<String> moreFruits = new ArrayList<>();
        moreFruits.add("Orange");
        moreFruits.add("Pineapple");

        fruits.addAll(moreFruits);
        System.out.println("ArrayList after adding all elements from another collection: " + fruits); // [Kiwi, Grapes, Apple, Orange, Pineapple]

        ArrayList<String> evenMoreFruits = new ArrayList<>();
        evenMoreFruits.add("Strawberry");
        evenMoreFruits.add("Blueberry");

        fruits.addAll(1, evenMoreFruits);
        System.out.println("ArrayList after adding all elements from another collection at a specific index (1): " + fruits); // [Kiwi, Strawberry, Blueberry, Grapes, Apple, Orange, Pineapple]

        System.out.println("Index of a specific element (e.g., 'Apple'): " + fruits.indexOf("Apple")); // 4

        System.out.println("Last index of a specific element (if it exists multiple times, e.g., adding 'Kiwi' again):");
        fruits.add("Kiwi");
        System.out.println("Current ArrayList: " + fruits); // [Kiwi, Strawberry, Blueberry, Grapes, Apple, Orange, Pineapple, Kiwi]
        System.out.println("Last index of 'Kiwi': " + fruits.lastIndexOf("Kiwi")); // 7

        System.out.println("Is the ArrayList empty? " + fruits.isEmpty()); // false

        fruits.clear();
        System.out.println("ArrayList after clearing all elements: " + fruits); // []
        System.out.println("Is the ArrayList empty now? " + fruits.isEmpty()); // true

    }
}