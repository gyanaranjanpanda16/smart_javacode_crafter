package com.gyanaranjan.lld.library;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void supportsCheckoutReturnAndReborrow() {
        Library library = new Library();
        library.registerCopy("copy-1");
        library.checkout("copy-1", "alice");
        assertEquals("alice", library.activeLoans().get("copy-1"));
        library.returnCopy("copy-1", "alice");
        assertTrue(library.activeLoans().isEmpty());
        library.checkout("copy-1", "bob");
        assertEquals("bob", library.activeLoans().get("copy-1"));
    }
    @Test void rejectsInvalidTransitionsWithoutLosingLoan() {
        Library library = new Library();
        assertThrows(IllegalArgumentException.class, () -> library.registerCopy(" "));
        assertThrows(IllegalArgumentException.class, () -> library.checkout("unknown", "a"));
        library.registerCopy("c");
        assertThrows(IllegalArgumentException.class, () -> library.registerCopy("c"));
        assertThrows(IllegalArgumentException.class, () -> library.checkout("c", null));
        assertThrows(IllegalStateException.class, () -> library.returnCopy("c", "a"));
        library.checkout("c", "a");
        assertThrows(IllegalStateException.class, () -> library.checkout("c", "b"));
        assertThrows(IllegalStateException.class, () -> library.returnCopy("c", "b"));
        assertEquals("a", library.activeLoans().get("c"));
    }
    @Test void snapshotCannotChangeInternalState() {
        Library library = new Library();
        library.registerCopy("c");
        library.checkout("c", "a");
        var snapshot = library.activeLoans();
        assertThrows(UnsupportedOperationException.class, () -> snapshot.put("c", "b"));
        library.returnCopy("c", "a");
        assertEquals("a", snapshot.get("c"));
    }
    @Test void concurrentCheckoutHasExactlyOneWinner() throws Exception {
        Library library = new Library();
        library.registerCopy("c");
        CountDownLatch start = new CountDownLatch(1);
        try (var executor = Executors.newFixedThreadPool(2)) {
            Future<Boolean> first = executor.submit(() -> borrow(library, start, "a"));
            Future<Boolean> second = executor.submit(() -> borrow(library, start, "b"));
            start.countDown();
            boolean firstWon = first.get(5, TimeUnit.SECONDS);
            boolean secondWon = second.get(5, TimeUnit.SECONDS);
            assertNotEquals(firstWon, secondWon);
            assertEquals(1, library.activeLoans().size());
        }
    }
    private boolean borrow(Library library, CountDownLatch start, String member) throws Exception {
        start.await();
        try {
            library.checkout("c", member);
            return true;
        } catch (IllegalStateException alreadyBorrowed) {
            return false;
        }
    }
}
