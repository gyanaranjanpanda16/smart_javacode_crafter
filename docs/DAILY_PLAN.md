# Daily assignments — October 1–December 31, 2026

**92 dated sessions.** Follow the 90-minute DSA + 60-minute design + 30-minute review split in [STUDY_PLAN](STUDY_PLAN.md). Each row gives a concrete coding assignment and design task. Check it only after the attempt, notes and tests/design artifact are saved; a hinted solve must still be labeled in the tracker.

**DSA starting level: absolute beginner.** Development experience does not count as DSA knowledge. Begin with the [Day 1 foundation lesson](../java-dsa-practice/lessons/day-001-foundations.md). The first two weeks use small exercises and untimed checks, not interview mocks.

Before each unfamiliar problem, learn the relevant representation/invariant, trace a small example, then code. Use the problem title to find a statement or define your own contract for the original exercises. These are practice selections, not claims about company question frequency. For an unseen mock, choose an unsolved problem in the specified pattern before starting the timer.

On every date, use the final 30 minutes for due reviews and the progress log. Weekly assessment days include one true STAR/project story. Revision dates that fall in January are follow-up maintenance, not extra December assignments.

## Week 1: Oct 01–Oct 07 — Programming logic, loops and methods

| Done | Day | Date | DSA — 90 min | Design — 60 min |
| --- | --- | --- | --- | --- |
| ☐ | 001 | 2026-10-01 (Thu) | What is an algorithm? Run a Java main method; variables, int/boolean, arithmetic and output; trace adding two numbers | LLD: classes vs objects; model Book and Member with explicit fields |
| ☐ | 002 | 2026-10-02 (Fri) | Comparisons and if/else: even/odd, larger of two numbers, positive/negative/zero; trace each branch | HLD: trace DNS → HTTP → server → database; draw the request path |
| ☐ | 003 | 2026-10-03 (Sat) | for/while loops: print 1 to n, sum 1 to n and count even numbers; make a variable trace table | LLD: encapsulation, interfaces and immutable records; define library API |
| ☐ | 004 | 2026-10-04 (Sun) | Nested loops and operation counting: print a small rectangle; compare one loop with two nested loops; introduce O(1), O(n), O(n²) | HLD: client/server, latency vs throughput; calculate requests/second |
| ☐ | 005 | 2026-10-05 (Mon) | Methods, parameters and return values; count digits and sum digits of a nonnegative integer; handle zero explicitly | LLD: implement and test library checkout/return; explain its invariant |
| ☐ | 006 | 2026-10-06 (Tue) | Repeat loops and method exercises without notes; debug an off-by-one error using a trace table | HLD: sketch a single-server library service, schema and one failure |
| ☐ | 007 | 2026-10-07 (Wed) | Untimed basics checkpoint: write an even/odd method and sum 1 to n; explain every line and test n=0 and n=1 | Review both weekly design artifacts: 30 min LLD + 30 min HLD; record one concrete repair per track |

## Week 2: Oct 08–Oct 14 — Arrays, strings, linear search and basic sorting

| Done | Day | Date | DSA — 90 min | Design — 60 min |
| --- | --- | --- | --- | --- |
| ☐ | 008 | 2026-10-08 (Thu) | Arrays from zero: declaration, zero-based indices, length and traversal; print elements and compute their sum | LLD: reference/value equality and immutable map keys; write tests |
| ☐ | 009 | 2026-10-09 (Fri) | Array maximum and minimum: initialize from the first element; test singleton and all-negative inputs | HLD: relational tables, primary keys, indexes and access patterns |
| ☐ | 010 | 2026-10-10 (Sat) | Swap two variables, then reverse an array using left/right indices; draw each swap | LLD: SOLID through library responsibilities; extract a loan policy |
| ☐ | 011 | 2026-10-11 (Sun) | Strings from zero: length, charAt and iteration; count vowels, then check a simple case-sensitive palindrome | HLD: transactions and isolation; concurrent checkout example |
| ☐ | 012 | 2026-10-12 (Mon) | Linear search: return an index or -1; then trace and implement bubble sort on five integers | LLD: composition and Strategy; add two loan policies with tests |
| ☐ | 013 | 2026-10-13 (Tue) | Re-solve one array and one string exercise without notes; practice empty/singleton input contracts | HLD: SQL vs key/value storage; choose based on library queries |
| ☐ | 014 | 2026-10-14 (Wed) | Untimed foundation checkpoint: find array maximum, search for a value and explain loop bounds and O(n); repair gaps before new patterns | Review both weekly design artifacts: 30 min LLD + 30 min HLD; record one concrete repair per track |

## Week 3: Oct 15–Oct 21 — First hashing, two-pointer, search and window patterns

| Done | Day | Date | DSA — 90 min | Design — 60 min |
| --- | --- | --- | --- | --- |
| ☐ | 015 | 2026-10-15 (Thu) | HashMap/HashSet from zero: add/get/contains; count integer frequencies and detect a duplicate; compare with nested loops | LLD: parking lot requirements, Vehicle/Spot/Ticket and invariants |
| ☐ | 016 | 2026-10-16 (Fri) | Two Sum: first implement the nested-loop solution, then derive a complement lookup with HashMap | HLD: load balancer, stateless services and horizontal scaling |
| ☐ | 017 | 2026-10-17 (Sat) | Two Sum II: two pointers on sorted input; trace why each pointer moves | LLD: implement parking allocation and release as one vertical slice |
| ☐ | 018 | 2026-10-18 (Sun) | Binary search from zero: sorted-input requirement, midpoint and shrinking range; test absent and boundary values | HLD: cache-aside, TTL and invalidation; draw hit/miss paths |
| ☐ | 019 | 2026-10-19 (Mon) | First sliding window: maximum sum of k consecutive elements; brute force first, then reuse the previous window sum | LLD: test full lot, duplicate release and allocation policy changes |
| ☐ | 020 | 2026-10-20 (Tue) | Catch up one unfinished core task; otherwise re-solve two short weak problems or one substantial problem without notes | HLD: replication vs sharding; choose a key and explain hot keys |
| ☐ | 021 | 2026-10-21 (Wed) | Guided pattern checkpoint: choose a familiar search or Two Sum exercise, solve without notes, then explain correctness and cost; timing is optional | Review both weekly design artifacts: 30 min LLD + 30 min HLD; record one concrete repair per track |

## Week 4: Oct 22–Oct 28 — Linked lists, stacks and queues

| Done | Day | Date | DSA — 90 min | Design — 60 min |
| --- | --- | --- | --- | --- |
| ☐ | 022 | 2026-10-22 (Thu) | Linked lists from zero: Node, next and null; build/traverse three nodes, then reverse links with a drawing | LLD: define LRU cache get/put/eviction contracts and capacity behavior |
| ☐ | 023 | 2026-10-23 (Fri) | Merge Two Sorted Lists: dummy head and termination | HLD: queues, producers/consumers and asynchronous work |
| ☐ | 024 | 2026-10-24 (Sat) | Linked List Cycle: slow/fast pointers and proof sketch | LLD: implement LRU using a map and doubly linked nodes |
| ☐ | 025 | 2026-10-25 (Sun) | Stack and queue from zero: LIFO/FIFO and ArrayDeque operations; use a stack for Valid Parentheses | HLD: retries, backoff, timeouts and idempotency |
| ☐ | 026 | 2026-10-26 (Mon) | Implement Queue using Stacks: trace enqueue/dequeue; monotonic stacks are an optional later extension | LLD: test LRU updates, eviction order and invalid capacity |
| ☐ | 027 | 2026-10-27 (Tue) | Catch up one unfinished core task; otherwise re-solve two short weak problems or one substantial problem without notes | HLD: observability, SLOs and overload; define three useful metrics |
| ☐ | 028 | 2026-10-28 (Wed) | Assessment: 45-minute unseen problem at current difficulty + 45-minute correction and complexity review | Review both weekly design artifacts: 30 min LLD + 30 min HLD; record one concrete repair per track |

## Week 5: Oct 29–Nov 04 — Recursion, backtracking and tree foundations

| Done | Day | Date | DSA — 90 min | Design — 60 min |
| --- | --- | --- | --- | --- |
| ☐ | 029 | 2026-10-29 (Thu) | Recursion from zero: base case, decreasing input and call stack; trace countdown and factorial; compare with a loop | LLD: vending-machine requirements and state-transition diagram |
| ☐ | 030 | 2026-10-30 (Fri) | Subsets: draw the include/exclude recursion tree; implement and trace backtracking | HLD: URL shortener requirements and average/peak QPS estimates |
| ☐ | 031 | 2026-10-31 (Sat) | Permutations: choose, explore and undo; trace three elements before coding | LLD: implement select/pay/dispense transitions; keep scope small |
| ☐ | 032 | 2026-11-01 (Sun) | Binary trees from zero: node, root, child and leaf; trace preorder traversal, then Maximum Depth | HLD: URL shortener API, schema and read/write paths |
| ☐ | 033 | 2026-11-02 (Mon) | Binary Tree Level Order Traversal: BFS with a queue | LLD: test invalid transitions and insufficient payment |
| ☐ | 034 | 2026-11-03 (Tue) | Catch up one unfinished core task; otherwise re-solve two short weak problems or one substantial problem without notes | HLD: URL shortener cache, collisions and database outage behavior |
| ☐ | 035 | 2026-11-04 (Wed) | Assessment: 45-minute unseen problem at current difficulty + 45-minute correction and complexity review | Review both weekly design artifacts: 30 min LLD + 30 min HLD; record one concrete repair per track |

## Week 6: Nov 05–Nov 11 — Trees, BSTs and heaps

| Done | Day | Date | DSA — 90 min | Design — 60 min |
| --- | --- | --- | --- | --- |
| ☐ | 036 | 2026-11-05 (Thu) | Diameter of Binary Tree: combine subtree results | LLD: model meeting-room bookings and half-open time intervals |
| ☐ | 037 | 2026-11-06 (Fri) | Validate Binary Search Tree: bounds rather than parent-only checks | HLD: notification service requirements and delivery channels |
| ☐ | 038 | 2026-11-07 (Sat) | Lowest Common Ancestor of a Binary Tree: recursive cases | LLD: implement overlap checks and booking/cancel API |
| ☐ | 039 | 2026-11-08 (Sun) | Heaps from zero: min/max heap and PriorityQueue operations; then Kth Largest Element using a bounded heap | HLD: notification queue, retries, dead-letter handling and preferences |
| ☐ | 040 | 2026-11-09 (Mon) | Top K Frequent Elements: counting plus heap; compare bucket approach | LLD: test adjacent intervals, overlap, cancellation and invalid dates |
| ☐ | 041 | 2026-11-10 (Tue) | Catch up one unfinished core task; otherwise re-solve two short weak problems or one substantial problem without notes | HLD: notification idempotency and monitoring; write failure matrix |
| ☐ | 042 | 2026-11-11 (Wed) | Assessment: 45-minute unseen problem at current difficulty + 45-minute correction and complexity review | Review both weekly design artifacts: 30 min LLD + 30 min HLD; record one concrete repair per track |

## Week 7: Nov 12–Nov 18 — Graph foundations

| Done | Day | Date | DSA — 90 min | Design — 60 min |
| --- | --- | --- | --- | --- |
| ☐ | 043 | 2026-11-12 (Thu) | Graph representations and BFS/DFS: Flood Fill | LLD: threads, races and visibility; reproduce a double-booking bug |
| ☐ | 044 | 2026-11-13 (Fri) | Number of Islands: visited state and traversal | HLD: rate limiter requirements; fixed vs sliding windows |
| ☐ | 045 | 2026-11-14 (Sat) | Clone Graph: identity map and cycles | LLD: synchronize booking check-and-insert; explain atomicity |
| ☐ | 046 | 2026-11-15 (Sun) | Rotting Oranges: multi-source BFS | HLD: token bucket, shared state and atomic updates |
| ☐ | 047 | 2026-11-16 (Mon) | Course Schedule: cycle detection and topological prerequisites | LLD: write concurrent booking test; explain lock granularity |
| ☐ | 048 | 2026-11-17 (Tue) | Catch up one unfinished core task; otherwise re-solve two short weak problems or one substantial problem without notes | HLD: distributed limiter hot keys, outage behavior and regional limits |
| ☐ | 049 | 2026-11-18 (Wed) | Assessment: 45-minute unseen problem at current difficulty + 45-minute correction and complexity review | Review both weekly design artifacts: 30 min LLD + 30 min HLD; record one concrete repair per track |

## Week 8: Nov 19–Nov 25 — Graph algorithms, greedy and intervals

| Done | Day | Date | DSA — 90 min | Design — 60 min |
| --- | --- | --- | --- | --- |
| ☐ | 050 | 2026-11-19 (Thu) | Course Schedule II: construct a topological order | LLD: task-scheduler API, task lifecycle and cancellation requirements |
| ☐ | 051 | 2026-11-20 (Fri) | Redundant Connection: union-find with path compression | HLD: news-feed requirements, data model and read/write ratio |
| ☐ | 052 | 2026-11-21 (Sat) | Network Delay Time: Dijkstra and nonnegative edge weights | LLD: implement a small in-memory scheduler lifecycle using an executor |
| ☐ | 053 | 2026-11-22 (Sun) | Merge Intervals: sorting and overlap invariant | HLD: feed fan-out on write vs read; celebrity-account tradeoff |
| ☐ | 054 | 2026-11-23 (Mon) | Jump Game: greedy reachability; distinguish it from DP | LLD: test cancellation and failure; define shutdown behavior |
| ☐ | 055 | 2026-11-24 (Tue) | Catch up one unfinished core task; otherwise re-solve two short weak problems or one substantial problem without notes | HLD: feed pagination, freshness, cache and overloaded fan-out |
| ☐ | 056 | 2026-11-25 (Wed) | Assessment: 45-minute unseen problem at current difficulty + 45-minute correction and complexity review | Review both weekly design artifacts: 30 min LLD + 30 min HLD; record one concrete repair per track |

## Week 9: Nov 26–Dec 02 — Dynamic programming foundations

| Done | Day | Date | DSA — 90 min | Design — 60 min |
| --- | --- | --- | --- | --- |
| ☐ | 057 | 2026-11-26 (Thu) | Climbing Stairs: recursion → memoization → tabulation → constant space | LLD: expense-sharing requirements; model money with BigDecimal |
| ☐ | 058 | 2026-11-27 (Fri) | Min Cost Climbing Stairs: define state and base cases | HLD: chat requirements, APIs and conversation/message schema |
| ☐ | 059 | 2026-11-28 (Sat) | House Robber: take/skip recurrence | LLD: implement equal-split expense accounting with rounding rules |
| ☐ | 060 | 2026-11-29 (Sun) | Unique Paths: grid DP and row compression | HLD: chat connections, message ordering and offline delivery |
| ☐ | 061 | 2026-11-30 (Mon) | Minimum Path Sum: transition from two predecessor cells | LLD: test rounding, invalid participants and balance conservation |
| ☐ | 062 | 2026-12-01 (Tue) | Catch up one unfinished core task; otherwise re-solve two short weak problems or one substantial problem without notes | HLD: chat reconnect, deduplication, presence and failure paths |
| ☐ | 063 | 2026-12-02 (Wed) | Assessment: 45-minute unseen problem at current difficulty + 45-minute correction and complexity review | Review both weekly design artifacts: 30 min LLD + 30 min HLD; record one concrete repair per track |

## Week 10: Dec 03–Dec 09 — Knapsack and sequence DP

| Done | Day | Date | DSA — 90 min | Design — 60 min |
| --- | --- | --- | --- | --- |
| ☐ | 064 | 2026-12-03 (Thu) | Coin Change: minimum coins; impossible-state sentinel | LLD: extend expense ledger with percentage splits and a policy interface |
| ☐ | 065 | 2026-12-04 (Fri) | Coin Change II: combinations, loop order and unbounded choices | HLD: file-storage requirements, metadata and chunk sizing estimates |
| ☐ | 066 | 2026-12-05 (Sat) | Partition Equal Subset Sum: 0/1 knapsack and descending update order | LLD: implement settlement calculation; keep rounding explicit |
| ☐ | 067 | 2026-12-06 (Sun) | Longest Common Subsequence: two-dimensional state | HLD: multipart upload, resumability and object/metadata separation |
| ☐ | 068 | 2026-12-07 (Mon) | Longest Increasing Subsequence: O(n²) DP; faster method is optional | LLD: test settlement invariants and policy substitution |
| ☐ | 069 | 2026-12-08 (Tue) | Catch up one unfinished core task; otherwise re-solve two short weak problems or one substantial problem without notes | HLD: file-storage permissions, durability and partial-upload cleanup |
| ☐ | 070 | 2026-12-09 (Wed) | Assessment: 45-minute unseen problem at current difficulty + 45-minute correction and complexity review | Review both weekly design artifacts: 30 min LLD + 30 min HLD; record one concrete repair per track |

## Week 11: Dec 10–Dec 16 — DP consolidation, tries and bits

| Done | Day | Date | DSA — 90 min | Design — 60 min |
| --- | --- | --- | --- | --- |
| ☐ | 071 | 2026-12-10 (Thu) | Word Break: prefix DP and reachability | LLD: payment state machine; define provider boundary and idempotency |
| ☐ | 072 | 2026-12-11 (Fri) | Edit Distance: insert/delete/replace recurrence; allow a guided first attempt | HLD: ticket-booking requirements, holds and seat inventory schema |
| ☐ | 073 | 2026-12-12 (Sat) | Implement Trie: insert/search/startsWith and representation | LLD: implement payment transitions with a fake provider |
| ☐ | 074 | 2026-12-13 (Sun) | Single Number: XOR; explain bit identities | HLD: atomic seat holds, expiry and payment/booking coordination |
| ☐ | 075 | 2026-12-14 (Mon) | Re-solve weakest DP problem without notes; compare memoization/tabulation | LLD: test duplicate requests and invalid payment transitions |
| ☐ | 076 | 2026-12-15 (Tue) | Catch up one unfinished core task; otherwise re-solve two short weak problems or one substantial problem without notes | HLD: outbox/reconciliation concepts; failed-payment and expired-hold cases |
| ☐ | 077 | 2026-12-16 (Wed) | Assessment: 45-minute unseen problem at current difficulty + 45-minute correction and complexity review | Review both weekly design artifacts: 30 min LLD + 30 min HLD; record one concrete repair per track |

## Week 12: Dec 17–Dec 23 — Mixed interview practice and gap repair

| Done | Day | Date | DSA — 90 min | Design — 60 min |
| --- | --- | --- | --- | --- |
| ☐ | 078 | 2026-12-17 (Thu) | 45-minute unseen arrays/window medium; 45-minute review and correction | LLD: 45-minute parking-lot mock + 15-minute rubric/feedback |
| ☐ | 079 | 2026-12-18 (Fri) | 45-minute unseen tree/heap medium; 45-minute review and correction | HLD: 45-minute URL-shortener mock + 15-minute rubric/feedback |
| ☐ | 080 | 2026-12-19 (Sat) | 45-minute unseen graph medium; 45-minute review and correction | LLD: repair the weakest mock behavior and add focused tests |
| ☐ | 081 | 2026-12-20 (Sun) | 45-minute unseen DP medium; 45-minute review and correction | HLD: repair estimates, failure handling or bottleneck explanation |
| ☐ | 082 | 2026-12-21 (Mon) | Re-solve two short failed attempts, or one substantial failure, without notes | LLD: 45-minute booking mock + 15-minute rubric/feedback |
| ☐ | 083 | 2026-12-22 (Tue) | Catch up one unfinished core task; otherwise re-solve two short weak problems or one substantial problem without notes | HLD: 45-minute chat mock + 15-minute rubric/feedback |
| ☐ | 084 | 2026-12-23 (Wed) | Assessment: 45-minute unseen problem at current difficulty + 45-minute correction and complexity review | Review both weekly design artifacts: 30 min LLD + 30 min HLD; record one concrete repair per track |

## Week 13: Dec 24–Dec 30 — Final interview rehearsal

| Done | Day | Date | DSA — 90 min | Design — 60 min |
| --- | --- | --- | --- | --- |
| ☐ | 085 | 2026-12-24 (Thu) | 45-minute unseen coding mock #1; explain, test and review | LLD: 45-minute task-scheduler mock + 15-minute feedback |
| ☐ | 086 | 2026-12-25 (Fri) | 45-minute unseen coding mock #2; explain, test and review | HLD: 45-minute news-feed mock + 15-minute feedback |
| ☐ | 087 | 2026-12-26 (Sat) | Repair weakest DSA pattern from recent mocks | LLD: repair API/invariant/concurrency gaps found in final mocks |
| ☐ | 088 | 2026-12-27 (Sun) | 45-minute unseen coding mock #3; explain, test and review | HLD: repair capacity, consistency and reliability gaps |
| ☐ | 089 | 2026-12-28 (Mon) | Re-solve the most important remaining coding failure without hints | LLD: explain one complete design and demonstrate its tests |
| ☐ | 090 | 2026-12-29 (Tue) | Catch up one unfinished core task; otherwise re-solve two short weak problems or one substantial problem without notes | HLD: defend two architectures aloud and compare alternatives |
| ☐ | 091 | 2026-12-30 (Wed) | Assessment: 45-minute unseen problem at current difficulty + 45-minute correction and complexity review | Review both weekly design artifacts: 30 min LLD + 30 min HLD; record one concrete repair per track |

## Final day — December 31

| Done | Day | Date | DSA — 90 min | Design — 60 min |
| --- | --- | --- | --- | --- |
| ☐ | 092 | 2026-12-31 (Thu) | Final assessment: 45-minute unseen medium + 45-minute review; score independent correctness, tests and complexity | 30 min LLD walkthrough + 30 min HLD walkthrough using your strongest completed artifacts; compare with prior full mocks |

Use the final 30 minutes to score [readiness](INTERVIEW_READINESS.md), finish the tracker, and list the three gaps to address next. Today's short design walkthroughs do not replace the full 45-minute mocks scheduled earlier.
