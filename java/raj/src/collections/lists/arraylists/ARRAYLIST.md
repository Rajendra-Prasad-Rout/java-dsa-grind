
# 📘 Java ArrayList: Your Dynamic Array Companion 🚀

Java’s `ArrayList` is a part of the `java.util` package and is one of the most commonly used **dynamic data structures**.

---

## 🌟 What is an ArrayList?

`ArrayList` is like an **array that grows** as you add elements. It's a **resizable array implementation** of the `List` interface.

---

## 📜 Core Concepts

* **Dynamic Array:** Unlike traditional fixed-size arrays, `ArrayList` can automatically adjust its capacity to accommodate new elements.
* **Ordered Collection:** Elements are stored in the order they are added, and their position is maintained. You can access elements by their index (starting from 0).
* **Allows Duplicates:** You can have multiple occurrences of the same element within an `ArrayList`.
* **Not Thread-Safe:** `ArrayList` is not synchronized. If multiple threads modify it concurrently without external synchronization, it can lead to data inconsistencies.
* **Implements `List`:** It inherits all the methods defined in the `java.util.List` interface.
* **Internal Implementation:** Internally, `ArrayList` uses a standard Java array to store its elements. When the array becomes full, a new, larger array is created, and the elements are copied over.

---

## 🔧 How to Use

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println(fruits); // [Apple, Banana]
    }
}
```

---

## 📦 Common Methods

| Method | Description |
|--------|-------------|
| `add(E e)` | Adds element to end |
| `add(int index, E element)` | Inserts at index |
| `get(int index)` | Gets value |
| `set(int index, E element)` | Replaces value |
| `remove(int index)` | Removes by index |
| `remove(Object o)` | Removes first match |
| `contains(Object o)` | Checks if present |
| `clear()` | Removes all |
| `size()` | Returns count |
| `isEmpty()` | Checks if list is empty |

---

## ✅ Example Use Cases

### 1️⃣ Remove All Even Numbers

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        nums.removeIf(n -> n % 2 == 0);
        System.out.println(nums); // [1, 3, 5]
    }
}
```

---

### 2️⃣ Find Max Element

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(10, 25, 33, 7));
        int max = Collections.max(nums);
        System.out.println(max); // 33
    }
}
```

---

### 3️⃣ Reverse a List

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        Collections.reverse(list);
        System.out.println(list); // [3, 2, 1]
    }
}
```

---

### 4️⃣ Check Palindrome

```java
import java.util.*;

public class Main {
    public static boolean isPalindrome(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            if (!list.get(i).equals(list.get(j))) return false;
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 2, 1));
        System.out.println(isPalindrome(list)); // true
    }
}
```

---

### 5️⃣ Remove Duplicates

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 2, 3, 3, 4));
        Set<Integer> set = new LinkedHashSet<>(nums);
        nums = new ArrayList<>(set);
        System.out.println(nums); // [1, 2, 3, 4]
    }
}
```

---

### 6️⃣ Sort a List

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(5, 2, 9, 1));
        Collections.sort(nums);
        System.out.println(nums); // [1, 2, 5, 9]
    }
}
```

---

## 🚀 Pros and Cons

### ✅ Pros
- Dynamic size 📏
- Easy to use
- Powerful built-in methods
- Fast random access (O(1))

### ⚠️ Cons
- Slower insertion/deletion in the middle (O(n))
- Not thread-safe ❌
- Can waste space due to internal capacity

---

## 🎓 Challenges for You to Try

1. Rotate an ArrayList by k positions.
2. Merge two sorted ArrayLists.
3. Find frequency of each element.
4. Filter strings shorter than 4 characters.
5. Find second largest element.

---

## 📚 Final Tips

- Always prefer `List` as the reference type:

  ```java
  List<String> list = new ArrayList<>();
  ```

- Use `LinkedList` if you do a lot of middle insertions/deletions.

---

Happy Coding! 🎉