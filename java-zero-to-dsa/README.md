# Java from zero to dynamic programming

A beginner course for someone with no coding background. Start at lesson 1 and follow the numbered folders. You do not need to understand all the words on this page today.

There are **24 lessons and 35 runnable Java programs**. Every lesson explains the idea in everyday language, walks through the code, shows the expected output, and gives a small exercise. This covers foundations through introductory dynamic programming; it is a starting course, not the whole of Java or every interview topic.

## Your first five minutes

1. Open `01-hello-world/HelloWorld.java` and read the five lines of code.
2. Open a terminal in this `java-zero-to-dsa` folder. A terminal is a place to type instructions to the computer.
3. Type `java 01-hello-world/HelloWorld.java` and press Enter.
4. Compare the displayed text with the lesson README.
5. Replace `Hello, World!` with your name, save the file, and run again.

This source-file command needs JDK 11 or later. The examples are checked for Java 21 compatibility, matching the main repository. Your computer already has a Java installation. Run `java -version` if you need to check it. No extra libraries or downloads are needed for these examples.

If your terminal starts in the repository folder, first type:

```sh
cd java-zero-to-dsa
```

In IntelliJ, you can also use the run triangle beside `main` when the folder is recognised as Java source. If it is not, use the terminal command above. This course is a standalone learning folder; it does not need to be added to the repository's Maven modules.

## Learning order

| Lesson | Topic | Start here |
| --- | --- | --- |
| 01 | Your first Java program | [Read lesson](01-hello-world/README.md) |
| 02 | Store information and do maths | [Read lesson](02-variables-and-maths/README.md) |
| 03 | Let the user type | [Read lesson](03-keyboard-input/README.md) |
| 04 | Make decisions | [Read lesson](04-decisions/README.md) |
| 05 | Repeat work | [Read lesson](05-loops/README.md) |
| 06 | Reuse a set of instructions | [Read lesson](06-methods/README.md) |
| 07 | Store a row of values | [Read lesson](07-arrays/README.md) |
| 08 | Work with words | [Read lesson](08-strings/README.md) |
| 09 | Group related information and handle mistakes | [Read lesson](09-objects-and-errors/README.md) |
| 10 | Understand how work grows | [Read lesson](10-complexity/README.md) |
| 11 | Find an item | [Read lesson](11-searching/README.md) |
| 12 | Put values in order | [Read lesson](12-sorting/README.md) |
| 13 | Use ready-made containers | [Read lesson](13-collections-and-hashing/README.md) |
| 14 | Reuse work across neighbouring ranges | [Read lesson](14-prefix-sums-and-windows/README.md) |
| 15 | Build a chain of items | [Read lesson](15-linked-lists/README.md) |
| 16 | Choose who comes out first | [Read lesson](16-stacks-and-queues/README.md) |
| 17 | Solve a smaller version of the same job | [Read lesson](17-recursion-and-backtracking/README.md) |
| 18 | Explore branching information | [Read lesson](18-trees/README.md) |
| 19 | Repeatedly take the smallest item | [Read lesson](19-heaps/README.md) |
| 20 | Explore connected places | [Read lesson](20-graphs/README.md) |
| 21 | Make a locally best choice when it is justified | [Read lesson](21-greedy/README.md) |
| 22 | Understand dynamic programming | [Read lesson](22-dp-first-steps/README.md) |
| 23 | Use DP to compare choices | [Read lesson](23-dp-choice-problems/README.md) |
| 24 | Use a two-dimensional table | [Read lesson](24-dp-grids-and-strings/README.md) |

## A gentle daily routine

Spend 45–60 minutes if you can: read for 10 minutes, run and change code for 20 minutes, try an exercise for 20 minutes, and write down one thing you learned. Repeat a lesson whenever needed. Some later lessons may take several days.

- Lessons 1–9: learn how to write and read small Java programs.
- Lessons 10–16: learn how to store, search, and process information.
- Lessons 17–21: learn recursion, trees, graphs, and greedy choices.
- Lessons 22–24: learn DP after recursion and arrays feel comfortable.

Before reading a solution, predict what it will print. After reading it, close the file and try writing it again. Keep a separate copy when experimenting so you can compare with the working example.

## Help and tracking

- [Common errors explained simply](TROUBLESHOOTING.md)
- [Practice checklist and learning notes](PROGRESS.md)
- [How to think through a problem](PROBLEM-SOLVING.md)

All array and String methods assume non-null input unless stated otherwise. Examples use small inputs; the lesson notes describe other limits. The exercises are intentionally left for you to attempt; the supplied example programs are complete.

After this course, continue with merge sort, variable-size sliding windows, binary search variations, tries, union-find, topological sorting, weighted shortest paths, and more DP. Then add Java interfaces/inheritance, generics, concurrency, and system design according to your target role.
