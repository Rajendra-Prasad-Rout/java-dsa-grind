# 📚 Ultimate Guide to Sorting Algos 🚀

---

## 🔡 Table of Contents

1. 🫧 Bubble Sort
2. 🔍 Selection Sort
3. 🪜 Insertion Sort
4. 🧱 Merge Sort
5. ⚡ Quick Sort
6. 🪙 Counting Sort
7. 🪣 Bucket Sort
8. 📦 Radix Sort
9. 🧠 Heap Sort
10. 📊 Complexity Comparison Table

---

## 1. 🫧 Bubble Sort

### 💡 Concept
Bubble Sort repeatedly compares adjacent elements and **swaps if they're in the wrong order**. Bubbles rise to the top!

### 🔁 Visualization
```
[5, 3, 8, 4, 2]  
→ [3, 5, 4, 2, 8]  
→ [3, 4, 2, 5, 8]  
→ [3, 2, 4, 5, 8]  
→ [2, 3, 4, 5, 8]
```

### ⏱ Complexity
- Worst: O(n²)
- Best: O(n) (already sorted)
- Space: O(1)

---

## 2. 🔍 Selection Sort

### 💡 Concept
Repeatedly **find the smallest element** and place it at the beginning.

### 🔁 Visualization
```
[64, 25, 12, 22, 11]  
→ [11, 25, 12, 22, 64]  
→ [11, 12, 25, 22, 64]  
→ [11, 12, 22, 25, 64]
```

### ⏱ Complexity
- Worst/Best/Average: O(n²)
- Space: O(1)

---

## 3. 🪜 Insertion Sort

### 💡 Concept
Build the final sorted array one item at a time like sorting **playing cards**.

### 🔁 Visualization
```
[5, 3, 4, 1]  
→ [3, 5, 4, 1]  
→ [3, 4, 5, 1]  
→ [1, 3, 4, 5]
```

### ⏱ Complexity
- Worst: O(n²)
- Best: O(n)
- Space: O(1)

---

## 4. 🧱 Merge Sort

### 💡 Concept
Divide the array, **conquer each half**, and merge them back.

### 🔁 Visualization
```
Split: [38, 27, 43, 3, 9, 82, 10]  
→ [38, 27, 43] and [3, 9, 82, 10]  
→ Merge sorted halves
```

### ⏱ Complexity
- Time: O(n log n)
- Space: O(n)

---

## 5. ⚡ Quick Sort

### 💡 Concept
Pick a pivot, partition the array into smaller/larger elements, then sort each part.

### 🔁 Visualization
```
Pivot = 4 → [1, 3] [4] [5, 9]  
→ Merge = [1, 3, 4, 5, 9]
```

### ⏱ Complexity
- Worst: O(n²)
- Average: O(n log n)
- Space: O(log n)

---

## 6. 🪙 Counting Sort (Non-Comparison)

### 💡 Concept
Count how many times each value occurs, and use it to place elements.

### 🔁 Visualization
```
[4, 2, 2, 8, 3, 3, 1]  
→ Count: [0,1,2,2,1,0,0,0,1]  
→ Sorted: [1,2,2,3,3,4,8]
```

### ⏱ Complexity
- Time: O(n + k)
- Space: O(k)

---

## 7. 🪣 Bucket Sort

### 💡 Concept
Divide elements into several **buckets**, sort each bucket individually, then concatenate.

### 🔁 Visualization
```
Input: [0.25, 0.36, 0.58, 0.41, 0.29]  
→ Buckets: [0.25, 0.29], [0.36, 0.41], [0.58]  
→ Sorted: [0.25, 0.29, 0.36, 0.41, 0.58]
```

### ⏱ Complexity
- Time: O(n + k)
- Space: O(n + k)

---

## 8. 📦 Radix Sort

### 💡 Concept
Sort numbers digit by digit (from least significant to most significant).

### 🔁 Visualization
```
Input: [170, 45, 75, 90, 802]  
1st digit sort → [170, 90, 802, 45, 75]  
2nd digit sort → [802, 45, 75, 170, 90]  
3rd digit sort → [45, 75, 90, 170, 802]
```

### ⏱ Complexity
- Time: O(nk)
- Space: O(n + k)

---

## 9. 🧠 Heap Sort

### 💡 Concept
Build a max heap and repeatedly extract the maximum element.

### 🔁 Visualization
```
[4, 10, 3, 5, 1]  
→ Max Heap: [10, 5, 3, 4, 1]  
→ Sorted: [1, 3, 4, 5, 10]
```

### ⏱ Complexity
- Time: O(n log n)
- Space: O(1)

---

## 📊 Complexity Comparison Table

| Algorithm       | Best     | Average   | Worst     | Space    | Stable |
|----------------|----------|-----------|-----------|----------|--------|
| Bubble Sort     | O(n)     | O(n²)     | O(n²)     | O(1)     | ✅ Yes |
| Selection Sort  | O(n²)    | O(n²)     | O(n²)     | O(1)     | ❌ No  |
| Insertion Sort  | O(n)     | O(n²)     | O(n²)     | O(1)     | ✅ Yes |
| Merge Sort      | O(n log n) | O(n log n) | O(n log n) | O(n)   | ✅ Yes |
| Quick Sort      | O(n log n) | O(n log n) | O(n²)   | O(log n) | ❌ No  |
| Counting Sort   | O(n + k) | O(n + k) | O(n + k) | O(k)     | ✅ Yes |
| Bucket Sort     | O(n + k) | O(n + k) | O(n²)     | O(n + k) | ✅ Yes |
| Radix Sort      | O(nk)    | O(nk)     | O(nk)     | O(n + k) | ✅ Yes |
| Heap Sort       | O(n log n) | O(n log n) | O(n log n) | O(1)  | ❌ No  |

---

## ✅ Final Thoughts

- Use **Bubble / Insertion Sort** for small or mostly sorted arrays.
- Use **Merge or Quick Sort** for general-purpose, large-scale sorting.
- Use **Counting / Radix / Bucket** for non-comparison-based or digit-based sorting.

---

🧠 *Practice implementing each in Java and run them on custom input arrays to understand their real-world behavior!*