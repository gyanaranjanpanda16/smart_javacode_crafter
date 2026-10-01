package com.gyanaranjan.dsa.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayMaximumTest {
    @Test void findsMaximumWithoutMutatingInput() {
        int[] input = {4, 1, 9, 9, -3};
        assertEquals(9, ArrayMaximum.find(input));
        assertArrayEquals(new int[]{4, 1, 9, 9, -3}, input);
    }
    @Test void handlesNegativesAndExtremeValues() {
        assertEquals(-2, ArrayMaximum.find(new int[]{-8, -2, -5}));
        assertEquals(Integer.MIN_VALUE, ArrayMaximum.find(new int[]{Integer.MIN_VALUE}));
        assertEquals(Integer.MAX_VALUE, ArrayMaximum.find(new int[]{0, Integer.MAX_VALUE}));
    }
    @Test void rejectsMissingValues() {
        assertThrows(NullPointerException.class, () -> ArrayMaximum.find(null));
        assertThrows(IllegalArgumentException.class, () -> ArrayMaximum.find(new int[0]));
    }
}
