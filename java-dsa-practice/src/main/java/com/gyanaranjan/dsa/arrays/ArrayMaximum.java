package com.gyanaranjan.dsa.arrays;

import java.util.Objects;

/** A single-pass maximum: O(n) time, O(1) extra space; input is unchanged. */
public final class ArrayMaximum {
    private ArrayMaximum() { }

    public static int find(int[] values) {
        Objects.requireNonNull(values, "values");
        if (values.length == 0) {
            throw new IllegalArgumentException("values must not be empty");
        }
        int maximum = values[0];
        for (int i = 1; i < values.length; i++) {
            maximum = Math.max(maximum, values[i]);
        }
        return maximum;
    }
}
