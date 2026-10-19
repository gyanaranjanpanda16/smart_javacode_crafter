package com.gyanaranjan.dsa.strings;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** O(n) time and O(min(n, alphabet size)) space; measures UTF-16 char units. */
public final class LongestUniqueSubstring {
    private LongestUniqueSubstring() { }

    public static int length(String value) {
        Objects.requireNonNull(value, "value");
        Set<Character> window = new HashSet<>();
        int left = 0;
        int best = 0;
        for (int right = 0; right < value.length(); right++) {
            char next = value.charAt(right);
            while (window.contains(next)) {
                window.remove(value.charAt(left++));
            }
            window.add(next);
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
