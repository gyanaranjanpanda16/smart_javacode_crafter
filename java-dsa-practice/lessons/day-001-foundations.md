# October 1 — DSA from absolute zero

## What you are learning

An algorithm is a sequence of steps that solves a problem. A data structure is a way to organize data so those steps can work with it. Today you only need a few variables; arrays, maps and interview patterns come later.

**Goal:** run a small Java program, explain every line, and trace how values change. No prior DSA knowledge is required.

## Your 90 minutes

- 30 min: read the example and trace it on paper.
- 40 min: type and run it, then complete the small exercises below.
- 20 min: check results and explain the steps aloud.

Create a Java class named `FirstSteps` in a scratch file in IntelliJ. Use its Run action on `main`. This scratch exercise does not need Maven or JUnit; automated tests come after you understand methods and expected results.

```java
public class FirstSteps {
    public static void main(String[] args) {
        int first = 4;
        int second = 7;
        int total = first + second;
        boolean positive = total > 0;
        System.out.println(total);
        System.out.println(positive);
    }
}
```

`main` is where execution begins. An `int` stores a whole number within Java's integer range. A variable gives a value a name. `=` assigns a value; it is not an equality test. `+` adds these two numbers. A `boolean` is either true or false. `>` compares values. `println` displays a result.

## Trace before running

| After this line | first | second | total | positive |
| --- | --- | --- | --- | --- |
| `int first = 4;` | 4 | not declared | not declared | not declared |
| `int second = 7;` | 4 | 7 | not declared | not declared |
| `int total = first + second;` | 4 | 7 | 11 | not declared |
| `boolean positive = total > 0;` | 4 | 7 | 11 | true |

Expected output is `11`, then `true` on the next line.

## Small exercises

1. Change the numbers to 0 and 5. Predict the output, then run.
2. Change them to -4 and 4. Explain why the comparison gives false.
3. Calculate the difference and product of 6 and 3. Check against 3 and 18.
4. Predict `7 / 2` and `7 % 2`. For integer operands these give 3 and 1: quotient and remainder. Use a nonzero divisor.
5. Write the sum algorithm in plain words: store two numbers, add them, display the result.

## Done means

You can run the program, explain assignment versus comparison, and predict each exercise's output without copying an answer. Record any confusion in the progress log. Tomorrow introduces `if/else`; loops begin October 3. Do not jump to Two Sum or dynamic programming today.
