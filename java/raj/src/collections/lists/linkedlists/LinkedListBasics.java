package collections.lists.linkedlists;

import java.util.LinkedList;

public class LinkedListBasics {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.addLast("Cherry");
        list.addFirst("Mango");
        list.add(2, "Orange");

        System.out.println(list);         // Output: [Mango, Apple, Orange, Banana, Cherry]

        System.out.println(list.get(2));  // Output: Orange
        System.out.println(list.getFirst()); // Output: Mango
        System.out.println(list.getLast());  // Output: Cherry

        list.set(1, "Pineapple");         // [Mango, Pineapple, Orange, Banana, Cherry]
        System.out.println(list);         // Output: [Mango, Pineapple, Orange, Banana, Cherry]

        list.remove();                   // removes first: Mango -> [Pineapple, Orange, Banana, Cherry]
        list.remove(1);           // removes Orange -> [Pineapple, Banana, Cherry]
        list.removeFirst();              // removes Pineapple -> [Banana, Cherry]
        list.removeLast();               // removes Cherry -> [Banana]
        System.out.println(list);        // Output: [Banana]

        list.offer("Kiwi");              // [Banana, Kiwi]
        list.offerFirst("Papaya");       // [Papaya, Banana, Kiwi]
        list.offerLast("Grapes");        // [Papaya, Banana, Kiwi, Grapes]
        System.out.println(list);        // Output: [Papaya, Banana, Kiwi, Grapes]

        System.out.println(list.peek());     // Output: Papaya (head element, not removed)
        System.out.println(list.peekFirst()); // Output: Papaya
        System.out.println(list.peekLast());  // Output: Grapes

        System.out.println(list.poll());     // Output: Papaya (removed)
        System.out.println(list.pollFirst()); // Output: Banana (removed)
        System.out.println(list.pollLast());  // Output: Grapes (removed)
        System.out.println(list);             // Output: [Kiwi]

        list.clear();                      // []
        System.out.println(list);          // Output: []
    }

}
