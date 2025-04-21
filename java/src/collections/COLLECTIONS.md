# Java Collections Framework (JCF)

## 1. Basics & Foundation
- Collection vs Collections
- Iterable Interface
- Collection Interface
- Generics in Collections

## 2. Core Interfaces

### List
- **ArrayList**
    - Resizable array
    - Time complexity
    - Backed by `Object[]`
- **LinkedList**
    - Doubly linked list
    - Implements `Deque`
    - More efficient insert/remove
- **Vector** (Legacy)
- **Stack** (LIFO, extends `Vector`)

### Set
- **HashSet**
    - No duplicates, no order
    - Backed by `HashMap`
    - `hashCode/equals` contract
- **LinkedHashSet**
- **TreeSet**
    - Sorted (Red-Black Tree)
    - `NavigableSet` interface

### Queue
- **PriorityQueue**
    - Min-heap structure
    - Natural or custom `Comparator`
- **ArrayDeque**
- **LinkedList** (again — it’s versatile!)

### Map
- **HashMap**
    - Hashing, collision resolution
    - Bucket mechanism
    - One null key allowed
- **LinkedHashMap**
    - Insertion or access-order
- **TreeMap**
    - Sorted keys
    - `NavigableMap`
- **Hashtable** (Legacy, synchronized)
- **ConcurrentHashMap** (Thread-safe)

## 3. Utility Classes

### Collections
- `sort()`, `reverse()`, `shuffle()`
- `synchronizedList()`, etc.
- `binarySearch()`, `fill()`

### Arrays
- `asList()`, `sort()`, `copyOf()`, etc.

## 4. Java 8+ Functional Features

### Stream API
- `filter()`, `map()`, `reduce()`
- `collect()`, `groupingBy()`
- `parallelStream()`

### Lambda expressions
### Method references

## 5. Sorting & Comparators
- **Comparable** (natural ordering)
- **Comparator** (custom ordering)
    - `thenComparing()`, `reversed()`

## 6. Thread-Safe Collections

### Synchronized wrappers
- `Collections.synchronizedList()`

### Concurrent Collections
- `ConcurrentHashMap`
- `CopyOnWriteArrayList`
- BlockingQueue types

### Executors + Collections

## 7. Special Collections
- **EnumSet**
- **EnumMap**
- **IdentityHashMap**
- **WeakHashMap**
- `NavigableMap` / `NavigableSet`

## 8. Real-World Applications
- Building LRU Cache
- Caching with `LinkedHashMap`
- Counting Frequency (Map + Stream)
- Top-K elements (`PriorityQueue`)
- Grouping data from DB (`Collectors.groupingBy`)

## 9. Interview-Level Patterns
- Detect cycle in LinkedList
- Two Sum with `HashMap`
- Anagram grouping
- Merge intervals (`TreeMap`)
- Kth largest/smallest (Heap)
- Implement Stack using Queues (and vice versa)

## 10. Performance & Design Principles
- Time complexity analysis
- Load factor, rehashing, resizing
- Immutability & Defensive copies
- Choosing the right collection
