package com.gyanaranjan.dsa.strings;

import com.gyanaranjan.dsa.Array.WitoutRepeatingSubstring;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestUniqueSubstringTest {
    @Test void handlesWindowShrinkRegression() {
        assertEquals(3, LongestUniqueSubstring.length("abac"));
        assertEquals(3, WitoutRepeatingSubstring.substring("abac"));
        assertEquals(2, LongestUniqueSubstring.length("abba"));
        assertEquals(3, LongestUniqueSubstring.length("pwwkew"));
    }
    @Test void handlesEmptyRepeatedAndUniqueInputs() {
        assertEquals(0, LongestUniqueSubstring.length(""));
        assertEquals(1, LongestUniqueSubstring.length("aaaa"));
        assertEquals(5, LongestUniqueSubstring.length("abcde"));
        assertThrows(NullPointerException.class, () -> LongestUniqueSubstring.length(null));
    }
}
