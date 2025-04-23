package collections.lists.arraylists;

/**
 * A custom implementation of a dynamic array that mimics core features of Java's ArrayList.
 *
 * @param <T> the type of elements stored in this collection
 *
 * @author Rajendra
 */
public class CustomDynamicArray<T> {

    private T[] data;
    private int dataCount;

    /**
     * Constructs an empty {@code CustomDynamicArray} collection with an initial capacity of 10.
     */
    @SuppressWarnings("unchecked")
    public CustomDynamicArray() {
        data = (T[]) new Object[10];
        dataCount = 0;
    }

    /**
     * Constructs an empty {@code CustomDynamicArray} collection with the specified initial capacity.
     *
     * @param size The initial capacity of the collection.
     * @throws IllegalArgumentException if the specified initial capacity is negative.
     */
    @SuppressWarnings("unchecked")
    public CustomDynamicArray(int size) {
        if (size < 0)
            throw new IllegalArgumentException("Initial capacity cannot be negative: " + size);
        data = (T[]) new Object[size];
        dataCount = 0;
    }

    /**
     * Returns the number of elements in this collection.
     *
     * @return The number of elements currently in this collection.
     */
    public int size() {
        return dataCount;
    }

    /**
     * Returns the current capacity of this collection (the length of the underlying array).
     *
     * @return The capacity of this collection.
     */
    public int capacity() {
        return data.length;
    }

    /**
     * Increases the capacity of the underlying array, typically by doubling its size.
     * This method is called automatically when the collection is full and a new element is added.
     */
    private void grow() {
        T[] newArray = (T[]) new Object[capacity() * 2];
        for (int i = 0; i < data.length; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
    }

    /**
     * Checks if the given index is within the valid range of elements in the collection.
     *
     * @param index The index to check.
     * @throws IndexOutOfBoundsException if the index is out of bounds
     * ({@code index < 0 || index >= size()}).
     */
    private void checkIndex(int index) {
        if (index < 0 || index >= dataCount)
            throw new IndexOutOfBoundsException(index);
    }

    /**
     * Appends the specified element to the end of this collection.
     *
     * @param obj The element to be added to this collection.
     */
    public void add(T obj) {
        if (size() == capacity()) {
            grow();
        }
        data[dataCount++] = obj;
    }

    /**
     * Inserts the specified element at the specified position in this collection.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     *
     * @param index The index at which the specified element is to be inserted.
     * @param obj   The element to be inserted.
     * @throws IndexOutOfBoundsException if the index is out of range
     * ({@code index < 0 || index > size()}).
     */
    public void add(int index, T obj) {
        if (index < 0 || index > dataCount)
            throw new IndexOutOfBoundsException(index);
        if (size() == capacity()) grow();
        for (int i = dataCount - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = obj;
        dataCount++;
    }

    /**
     * Returns a string representation of this collection. The string
     * representation consists of a list of the collection's elements in the
     * order they are stored, enclosed in square brackets ("[]"). Adjacent
     * elements are separated by the characters ", " (comma and space).
     *
     * @return A string representation of this collection.
     */
    @Override
    public String toString() {
        if (dataCount == 0)
            return "[]";
        StringBuilder elementDataBuilder = new StringBuilder();
        elementDataBuilder.append("[");
        for (int i = 0; i < dataCount; i++) {
            elementDataBuilder.append(data[i]);
            elementDataBuilder.append(", ");
        }
        int start = elementDataBuilder.lastIndexOf(", ");
        int end = start + 2;
        elementDataBuilder.delete(start, end);
        elementDataBuilder.append("]");
        return elementDataBuilder.toString();
    }

    /**
     * Returns {@code true} if this collection contains no elements.
     *
     * @return {@code true} if this collection is empty; {@code false} otherwise.
     */
    public boolean isEmpty() {
        return dataCount == 0;
    }

    /**
     * Returns {@code true} if this collection contains the specified element.
     * More formally, returns {@code true} if and only if this collection
     * contains at least one element {@code e} such that
     * {@code Objects.equals(o, e)}.
     *
     * @param obj The element whose presence in this collection is to be tested.
     * @return {@code true} if this collection contains the specified element;
     * {@code false} otherwise.
     */
    public boolean contains(T obj) {
        return indexOf(obj) >= 0;
    }

    /**
     * Returns the index of the first occurrence of the specified element
     * in this collection, or -1 if this collection does not contain the element.
     * If the specified element is {@code null}, then this method returns the
     * index of the first {@code null} element in this collection.
     *
     * @param obj The element to search for.
     * @return The index of the first occurrence of the specified element in
     * this collection, or -1 if not found.
     */
    public int indexOf(T obj) {
        if (obj == null) {
            for (int i = 0; i < dataCount; i++) {
                if (data[i] == null) return i;
            }
        } else {
            for (int i = 0; i < dataCount; i++) {
                if (obj.equals(data[i])) return i;
            }
        }
        return -1;
    }

    /**
     * Replaces the element at the specified position in this collection with
     * the specified element.
     *
     * @param index   The index of the element to replace.
     * @param object The element to be stored at the specified position.
     * @return The element previously at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * ({@code index < 0 || index >= size()}).
     */
    public T set(int index, T object) {
        checkIndex(index);
        T oldElement = data[index];
        data[index] = object;
        return oldElement;
    }

    /**
     * Removes the element at the specified position in this collection.
     * Shifts any subsequent elements to the left (subtracts one from their
     * indices).
     *
     * @param index The index of the element to be removed.
     * @return The element that was removed from the collection.
     * @throws IndexOutOfBoundsException if the index is out of range
     * ({@code index < 0 || index >= size()}).
     */
    public T remove(int index) {
        checkIndex(index);

        T removingElement = data[index];
        for (; index < dataCount - 1; index++) {
            data[index] = data[index + 1];

        }
        data[dataCount - 1] = null;
        dataCount--;

        return removingElement;
    }

    /**
     * Removes the first occurrence of the specified element from this collection,
     * if it is present. If the collection does not contain the element, it is
     * unchanged. If the specified element is {@code null}, only the first
     * {@code null} element is removed.
     *
     * @param object The element to be removed from this collection, if present.
     * @return {@code true} if this collection contained the specified element
     * (or a {@code null} element, if the specified element was {@code null}),
     * {@code false} otherwise.
     */
    public boolean remove(T object) {
        int index = indexOf(object);
        if (index == -1) return false;
        remove(index);
        return true;
    }

    /**
     * Returns the first element in this collection.
     *
     * @return The first element in this collection.
     * @throws IndexOutOfBoundsException if the collection is empty.
     */
    public T getFirst() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Cannot get first element from an empty collection.");
        }
        return data[0];
    }

    /**
     * Returns the last element in this collection.
     *
     * @return The last element in this collection.
     * @throws IndexOutOfBoundsException if the collection is empty.
     */
    public T getLast() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Cannot get last element from an empty collection.");
        }
        return data[dataCount - 1];
    }

    /**
     * Returns the index of the first occurrence of the specified element
     * in this collection, or -1 if this collection does not contain the element.
     * This is functionally the same as {@link #indexOf(Object)}.
     * If the specified element is {@code null}, then this method returns the
     * index of the first {@code null} element in this collection.
     *
     * @param object The element to search for.
     * @return The index of the first occurrence of the specified element in
     * this collection, or -1 if not found.
     */
    public int firstIndexOf(T object) {
        return indexOf(object);
    }

    /**
     * Returns the index of the last occurrence of the specified element
     * in this collection, or -1 if this collection does not contain the element.
     * If the specified element is {@code null}, then this method returns the
     * index of the last {@code null} element in this collection.
     *
     * @param object The element to search for.
     * @return The index of the last occurrence of the specified element in
     * this collection, or -1 if not found.
     */
    public int lastIndexOf(T object) {
        if (object == null) {
            for (int i = dataCount - 1; i >= 0; i--) {
                if (data[i] == null) return i;
            }
        } else {
            for (int i = dataCount - 1; i >= 0; i--) {
                if (object.equals(data[i])) return i;
            }
        }
        return -1;
    }

    /**
     * Removes all the elements from this collection. The collection will be empty after this method returns.
     */
    public void clear() {
        for (int i = 0; i < dataCount; i++) {
            data[i] = null;
        }
        dataCount = 0;
    }
}