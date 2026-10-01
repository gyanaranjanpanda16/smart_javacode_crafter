package com.gyanaranjan.dsa.dp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {
    @Test void matchesKnownCounts() {
        long[] counts = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        for (int n = 0; n < counts.length; n++) {
            assertEquals(counts[n], ClimbingStairs.tabulated(n));
            assertEquals(counts[n], ClimbingStairs.optimized(n));
        }
    }
    @Test void handlesLargestSupportedInput() {
        assertEquals(7540113804746346429L, ClimbingStairs.tabulated(91));
        assertEquals(7540113804746346429L, ClimbingStairs.optimized(91));
    }
    @Test void rejectsNegativeAndOverflowInputs() {
        for (int n : new int[]{-1, 92, Integer.MAX_VALUE}) {
            assertThrows(IllegalArgumentException.class, () -> ClimbingStairs.tabulated(n));
            assertThrows(IllegalArgumentException.class, () -> ClimbingStairs.optimized(n));
        }
    }
}
