package com.gyanaranjan.DsaProgram;


import java.util.Arrays;

class ArrayListImplements<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public ArrayListImplements() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public ArrayListImplements(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        elements = new Object[initialCapacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E element) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    private void increaseCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Other methods such as remove, contains, indexOf, etc. can be added here
}
 class Main {
    public static void main(String[] args) {
        // Create an ArrayList with the default capacity
        ArrayListImplements<Integer> list1 = new ArrayListImplements<>();
        System.out.println(list1.size());
        // Add elements to the list
        list1.add(10);
        list1.add(20);
        list1.add(30);

        // Print the elements of the list
        System.out.println("list1: " + list1);

        // Create an ArrayList with a specific initial capacity
        ArrayListImplements<String> list2 = new ArrayListImplements<>();

        // Add elements to the list
        list2.add("apple");
        list2.add("banana");
        list2.add("orange");
        list2.add("orange");
        list2.add("orange");
        list2.add("orange");
        list2.add("orange");
        list2.add("orange");
        list2.add("orange");
        list2.add("orange");
        list2.add("orange");
        System.out.println(list2.size());
        // Print the elements of the list
        System.out.println("list2: " + list2);

        // Get an element from the list
        String fruit = list2.get(1);
        System.out.println("Fruit at index 1: " + fruit);
    }
}
