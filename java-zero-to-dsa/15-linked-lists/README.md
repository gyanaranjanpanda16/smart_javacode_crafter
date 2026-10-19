# 15. Build a chain of items

Each node is a box containing a value and a link to the next box, like a treasure hunt.

## New words

Node: value plus link. head: first node. null: no object, or the end of the chain.

## LinkedListDemo

Build and reverse a three-node chain.

Open [LinkedListDemo.java](LinkedListDemo.java). Read these steps alongside the code:

1. Create nodes and connect their next links.
2. Keep previous, current, and saved-next references.
3. Reverse one link, then move forward using the saved reference.

From the `java-zero-to-dsa` folder, run:

```sh
java 15-linked-lists/LinkedListDemo.java
```

Expected output:

```text
30
20
10
```

**Try it yourself:** Count the nodes before reversing. Try an empty list (null).

**Work and memory:** O(n) time; O(1) extra space.

## Before moving on

- [ ] I ran every example and matched the output.
- [ ] I changed the input and predicted the result.
- [ ] I explained the idea aloud in my own words.
- [ ] I tried the exercise without copying the solution.

[Course home](../README.md) · [Previous lesson](../14-prefix-sums-and-windows/README.md) · [Next lesson](../16-stacks-and-queues/README.md)
