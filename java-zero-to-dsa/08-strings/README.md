# 8. Work with words

A String stores text. Java strings cannot be changed in place; operations can produce new strings.

## New words

char: one UTF-16 code unit. charAt: get a position. equals: compare text content. These exercises use simple English letters.

## StringPalindrome

Check whether a word reads the same both ways.

Open [StringPalindrome.java](StringPalindrome.java). Read these steps alongside the code:

1. Compare the first and last letters.
2. Move inward, returning false at any mismatch.
3. If all pairs match, return true. Comparison here is case-sensitive.

From the `java-zero-to-dsa` folder, run:

```sh
java 08-strings/StringPalindrome.java
```

Expected output:

```text
true
false
true
olleh
```

**Try it yourself:** Try an empty string and one letter. Later, ignore spaces and letter case.

**Work and memory:** Palindrome check: O(n) time and O(1) extra space.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../07-arrays/README.md) · [Next lesson](../09-objects-and-errors/README.md)
