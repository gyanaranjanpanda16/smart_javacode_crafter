# October 1–December 31, 2026 — Java interview preparation

**92 days · 13 study weeks + a final assessment · 3 hours/day minimum (276 hours).**

**DSA starts from absolute zero: no prior algorithm, data-structure or competitive-programming knowledge is assumed.** Your development experience does not skip the foundation lessons. Start with Java program execution, variables, conditions, loops, tracing and methods before arrays or interview patterns. Build toward independent Java problem solving, tested object designs and defensible system designs. “Zero to hero” is the ambition; the observable goal is the readiness rubric below, not a guaranteed interview result.

## Daily time budget

- **90 minutes DSA, October 1–14:** 30 minutes explanation and hand tracing, 40 minutes small coding exercises, 20 minutes checking examples and explaining each line. No timed interview problems.
- **90 minutes DSA, October 15 onward:** 15 minutes concepts, 40 minutes independent attempt, 25 minutes implementation/tests, 10 minutes complexity and explanation. During mocks, use 45 minutes attempt + 45 minutes review.
- **60 minutes design:** follow that date's LLD or HLD assignment. The tracks alternate so you can finish a meaningful piece instead of rushing both daily.
- **30 minutes revision:** review due work, record mistakes, and explain one solution aloud. On assessment days use 15 minutes for review and 15 for a behavioral/project story.
- Optional extra 30–60 minutes: finish the current assignment or an explicitly optional extension. The core plan does not require this extra time.

Follow the exact dates in [DAILY_PLAN](DAILY_PLAN.md); record actual work in [PROGRESS](PROGRESS.md). Study weeks run **Thursday–Wednesday**, beginning October 1. Each has five focused coding days, one catch-up/revision day, and one assessment. The first two assessments are untimed fundamentals checks; the third is a guided pattern check. December 31 is a separate final assessment.

## Three phases

| Dates | DSA progression | Design progression |
| --- | --- | --- |
| Oct 1–31 | Variables, conditions, loops, methods, arrays/strings, basic sorting/search, first patterns, lists/stacks; begin recursion | OOP/SOLID, library, parking lot, LRU; HTTP, databases, caching, queues, reliability; begin URL shortener |
| Nov 1–30 | Backtracking, trees, heaps, BFS/DFS, graph algorithms, greedy; begin DP | Vending machine, booking, concurrency, scheduler, expenses; shortener, notifications, limiter, feed, chat |
| Dec 1–31 | Knapsack/sequence DP, tries/bits, mixed timed problems and weak-pattern repair | Complete expense/payment designs, file storage, booking consistency; LLD/HLD mocks and corrections |

## Dated weekly outcomes

| Week | Dates (2026) | DSA | LLD deliverable | HLD deliverable |
| --- | --- | --- | --- | --- |
| 1 | Oct 01–Oct 07 | Programming logic, loops and methods | Tested library model and loan invariant | Request path and single-server architecture |
| 2 | Oct 08–Oct 14 | Arrays, strings, linear search and basic sorting | Library policies and contract tests | Data model, indexes and transaction boundary |
| 3 | Oct 15–Oct 21 | First hashing, two-pointer, search and window patterns | Tested parking-lot allocation and release | Caching, scaling and partitioning notes |
| 4 | Oct 22–Oct 28 | Linked lists, stacks and queues | LRU implementation with eviction tests | Queue/retry flow and basic reliability checklist |
| 5 | Oct 29–Nov 04 | Recursion, backtracking and tree foundations | Vending-machine state transitions and tests | URL-shortener case study |
| 6 | Nov 05–Nov 11 | Trees, BSTs and heaps | Booking overlap checks and boundary tests | Notification-service design |
| 7 | Nov 12–Nov 18 | Graph foundations | Concurrent booking with an invariant test | Distributed rate-limiter design |
| 8 | Nov 19–Nov 25 | Graph algorithms, greedy and intervals | Small scheduler lifecycle and tests | News-feed design and fan-out tradeoffs |
| 9 | Nov 26–Dec 02 | Dynamic programming foundations | Expense ledger with conservation tests | Chat design with ordering/delivery semantics |
| 10 | Dec 03–Dec 09 | Knapsack and sequence DP | Expense policies and settlement tests | File-storage architecture |
| 11 | Dec 10–Dec 16 | DP consolidation, tries and bits | Payment transitions and duplicate-request tests | Ticket-booking consistency and failure analysis |
| 12 | Dec 17–Dec 23 | Mixed interview practice and gap repair | Two scored LLD mocks and corrections | Two scored HLD mocks and corrections |
| 13 | Dec 24–Dec 30 | Final interview rehearsal | Final scored LLD mock and repair | Final scored HLD mock and repair |

## Checkpoint criteria

- **October 31:** independently write loops and methods, traverse/search an array, use a frequency map, and trace a basic window/list problem; explain simple Big-O examples; show tests for library, parking lot and LRU; explain an HTTP request, database index and cache miss. Use that day's review block to record this gate.
- **November 30:** solve a tree/graph medium with an explicit traversal invariant; demonstrate concurrent booking behavior; explain requirements, estimates, API, schema and a failure path for a completed HLD; derive a basic DP recurrence. Record the gate in the review block.
- **December 16:** derive state, recurrence, base cases and evaluation order for representative grid, knapsack and sequence DP; explain LLD errors/concurrency and HLD consistency/retries without reading notes. Use the scheduled weekly assessment.
- **December 31:** evaluate the last three full mocks per relevant track using [INTERVIEW_READINESS](INTERVIEW_READINESS.md). Aim for 8/10 or better with no zero on correctness/failure handling. Log remaining weaknesses honestly; this is a self-assessment threshold, not a company hiring cutoff.

## How to learn from zero

**October 1–7:** program execution → variables → conditions → loops → nested loops → methods → untimed check. **October 8–14:** arrays → min/max → swaps/reversal → strings → linear search/basic sorting → untimed check. **October 15 onward:** introduce a data structure or pattern with a small worked example before its first interview exercise.

Foundation gate: do not move on merely because a date arrives. First write a loop and method without copying, trace array indices, find a maximum, perform linear search, and explain the result on a small input. If these are not comfortable by October 14, use the next pattern sessions to repair them and drop advanced extensions later. The December 31 end date stays fixed; demonstrated understanding determines how far you progress.

For each DSA topic: understand the data structure → trace an example → derive a simple approach → improve it → implement in Java → test → explain complexity. After 25–30 blocked minutes, take one hint, close it and continue. Include empty/singleton, duplicate, negative/overflow, and invalid-input cases when relevant.

For DP: state → recurrence → base cases → dependency order → result → complexity → space optimization. Begin with Climbing Stairs on November 26; do not postpone all DP until the final week.

For LLD: use cases → entities/value objects → invariants → interfaces → critical implementation → tests → change request. For HLD: requirements/SLOs → capacity estimates → API/schema → architecture → bottleneck → failures → tradeoffs.

## Revision and catch-up without moving December 31

Schedule reviews after 2, 7 and 21 days. Spend 30 minutes on the weakest due items first; a quick recall is enough for a strong item, while a failed recall needs a later full attempt. Use the weekly catch-up day for unfinished core work. If behind, drop optional follow-ups and advanced extensions before cutting revision or mocks. Log remaining gaps on December 31 instead of doubling the next day's workload.

Reviews for late-December problems may land in January; record them as maintenance follow-ups outside this plan. The dated core curriculum ends on December 31.

## Scope and priorities

The daily rows are the required path. Existing module guides may list broader examples; these are a reference backlog, not extra work within these 92 days. Prioritize independent easy/medium problem solving and a small number of thoroughly explained designs. Prefix-sum/hash combinations, variable sliding windows, monotonic stacks, and rotated-array search are optional extensions after the basics; they are not assumed prerequisites for the dated path. Advanced interval DP (such as Burst Balloons), segment trees, advanced string algorithms, additional design cases, and extra hard problems are deferred until the core gates are met.

Include one truthful behavioral story each weekly assessment day: ownership, conflict, failure, ambiguity, collaboration or impact. In December, use some review blocks for a concise résumé/project walkthrough. Confirm the actual interview scope with your recruiter for your target role and level.
