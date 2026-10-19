# How to solve a problem

1. Say the task in your own words. What goes in? What should come out?
2. Work through a tiny example on paper.
3. Describe the simplest correct steps in ordinary language.
4. Turn those steps into Java, one small part at a time.
5. Run the example. Then try an empty input, one item, repeated items, and boundary values where relevant.
6. Explain how the work and memory grow. Improve the approach only after you understand the first version.

## Example: find a number

Input: `[4, 8, 2]`, target `8`. Output: index `1`.

Plain-language plan: check each position. If its value matches, return that position. If the end is reached, return -1. This becomes the linear search in lesson 11.

## A five-question checklist for DP

1. **State:** What exactly does one saved answer mean?
2. **Choices:** Which smaller answers help calculate it?
3. **Starting point:** What answers do I know immediately?
4. **Order:** How do I ensure smaller answers are ready first?
5. **Result:** Which saved answer is the final result?

For climbing stairs: `ways[i]` counts routes to stair i. The last move comes from i-1 or i-2, so add those counts. Start with `ways[0]=1` and `ways[1]=1`. Work upward to n and return `ways[n]`.

For coin change, do not assume the largest coin is always the best choice. With coins 1, 3, 4 and amount 6, 3+3 is better than 4+1+1. A DP table compares those alternatives.
