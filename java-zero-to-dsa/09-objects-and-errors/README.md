# 9. Group related information and handle mistakes

An object groups data and actions, like a student record with a name and a way to introduce itself.

## New words

Class: blueprint. Object: one instance. Constructor: sets up an object. Exception: signals a problem.

## StudentDemo

Create two students from the same blueprint.

Open [StudentDemo.java](StudentDemo.java). Read these steps alongside the code:

1. The nested Student class defines the blueprint.
2. new creates an object; the constructor sets its name.
3. Each object stores its own name.

From the `java-zero-to-dsa` folder, run:

```sh
java 09-objects-and-errors/StudentDemo.java
```

Expected output:

```text
I am Asha
I am Ravi
```

**Try it yourself:** Add an age field and print it in introduce().

**Work and memory:** Not needed yet; focus on understanding the steps.

## HandleBadInput

Handle text that cannot be converted to a number.

Open [HandleBadInput.java](HandleBadInput.java). Read these steps alongside the code:

1. parseInt converts suitable text into an integer.
2. Invalid text throws NumberFormatException.
3. catch handles that specific problem with a friendly message.

From the `java-zero-to-dsa` folder, run:

```sh
java 09-objects-and-errors/HandleBadInput.java
```

Expected output:

```text
Please enter a whole number.
```

**Try it yourself:** Replace abc with 25. Then reject negative ages with an if statement.

**Work and memory:** Not needed yet; focus on understanding the steps.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../08-strings/README.md) · [Next lesson](../10-complexity/README.md)
