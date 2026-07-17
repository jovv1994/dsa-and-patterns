# 06 – Stack

## Definition

A Stack is a Last-In, First-Out (LIFO) data structure. Elements are pushed onto the top and popped from the top. It is ideal for problems that require tracking "the most recent unresolved item" or reversing order.

## When to Use It

- Validating balanced brackets / parentheses.
- Evaluating or converting arithmetic expressions.
- Implementing undo/redo functionality.
- Depth-First Search (iterative).
- Monotonic stack problems (next greater/smaller element).
- Parsing nested structures.

## Time and Space Complexity

| Operation | Time | Space |
|-----------|------|-------|
| Push | O(1) | – |
| Pop | O(1) | – |
| Peek (top) | O(1) | – |
| Search | O(n) | – |
| Overall space | – | O(n) |

## Common Data Structures

- `ArrayDeque` / `Stack` (Java)
- `list` with `.append()` / `.pop()` (Python)
- Linked list (custom implementation)

## Recognition Clues

- "Matching pairs" (brackets, tags, parentheses).
- "Next greater / smaller element."
- "Undo the last operation."
- "Evaluate a postfix / infix expression."
- Problems where the answer depends on the most recently seen unsettled item.

## Common Interview Problems

| Problem | Difficulty |
|---------|------------|
| Valid Parentheses | Easy |
| Min Stack | Medium |
| Daily Temperatures | Medium |
| Largest Rectangle in Histogram | Hard |
| Decode String | Medium |
| Evaluate Reverse Polish Notation | Medium |

## Complexity Summary

| Approach | Time | Space |
|----------|------|-------|
| Brute force scan for each query | O(n²) | O(1) |
| Stack-based single pass | O(n) | O(n) |

## References

- [LeetCode – Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
- [LeetCode – Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)
