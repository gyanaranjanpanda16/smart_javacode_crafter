package com.gyanaranjan.ZenCodingRoundQuestions01;


import java.util.*;

class LRUCache {
    private final int capacity;
    private final Map<Integer, Integer> cache;
    private final LinkedHashMap<Integer, Integer> lruOrder;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>(capacity);
        this.lruOrder = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {

                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        // Move the accessed key to the end to show it was recently used
        lruOrder.get(key);
        return cache.get(key);
    }

    public void set(int key, int value) {
        if (cache.containsKey(key)) {
            // Move the key to the end to show it was recently used
            lruOrder.get(key);
        } else {
            if (cache.size() >= capacity) {
                // Remove the least recently used item
                int eldestKey = lruOrder.entrySet().iterator().next().getKey();
                cache.remove(eldestKey);
                lruOrder.remove(eldestKey);
            }
        }
        cache.put(key, value);
        lruOrder.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.set(1, 1);
        cache.set(2, 2);
        System.out.println(cache.get(1)); // returns 1
        cache.set(3, 3);                  // evicts key 2
        System.out.println(cache.get(2)); // returns -1 (not found)
        cache.set(4, 4);                  // evicts key 1
        System.out.println(cache.get(1)); // returns -1 (not found)
        System.out.println(cache.get(3)); // returns 3
        System.out.println(cache.get(4)); // returns 4
    }
}
