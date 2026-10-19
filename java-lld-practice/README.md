# Low-level design with Java

**Active schedule:** [October 1–December 31, 2026](../docs/DAILY_PLAN.md). Follow the dated assignments; additional topics in this guide are optional reference material.

Goal: turn ambiguous requirements into cohesive objects with explicit invariants, then implement and test the critical behavior.

## Progression

1. Java contracts, composition, immutability and SOLID through a library domain.
2. Strategy for pricing; parking-lot allocation; LRU eviction.
3. State transitions in a vending machine; elevator scheduling policies.
4. Concurrency with bounded queues and a task scheduler.
5. Booking conflicts, expense ledgers, extensible logging, payment states.
6. Timed design + implementation mocks with change requests.

[Weekly tasks](../docs/STUDY_PLAN.md) define the order. Use the [LLD template](../templates/LLD.md) for each case.

## Starter: library loans

[Implementation](src/main/java/com/gyanaranjan/lld/library/Library.java) · [Tests](src/test/java/com/gyanaranjan/lld/library/LibraryTest.java) · [Design notes](cases/library.md)

The starter demonstrates an invariant, explicit errors, and an immutable snapshot. Extend it with membership and loan policies only after defining the new requirements. No framework is required to practice object design.

Run `mvn -pl java-lld-practice -am test`.

## 60-minute practice block

10 min requirements and invariants; 10 min API/class model; 25 min critical implementation; 10 min tests; 5 min tradeoffs. In an interview, adapt to the interviewer's requested split.
