package com.gyanaranjan.lld.library;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/** Single-process library: a registered physical copy has at most one borrower. */
public final class Library {
    private final Set<String> copies = new HashSet<>();
    private final Map<String, String> loans = new HashMap<>();

    public synchronized void registerCopy(String copyId) {
        requireId(copyId);
        if (!copies.add(copyId)) {
            throw new IllegalArgumentException("Copy already registered");
        }
    }

    public synchronized void checkout(String copyId, String memberId) {
        requireKnownCopy(copyId);
        requireId(memberId);
        if (loans.containsKey(copyId)) {
            throw new IllegalStateException("Copy already on loan");
        }
        loans.put(copyId, memberId);
    }

    public synchronized void returnCopy(String copyId, String memberId) {
        requireKnownCopy(copyId);
        requireId(memberId);
        if (!memberId.equals(loans.get(copyId))) {
            throw new IllegalStateException("No matching loan");
        }
        loans.remove(copyId);
    }

    public synchronized Map<String, String> activeLoans() {
        return Map.copyOf(loans);
    }

    private void requireKnownCopy(String copyId) {
        requireId(copyId);
        if (!copies.contains(copyId)) {
            throw new IllegalArgumentException("Unknown copy");
        }
    }

    private static void requireId(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID must not be blank");
        }
    }
}
