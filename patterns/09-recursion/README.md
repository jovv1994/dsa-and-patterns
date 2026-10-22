# 09 – Recursion

## Definition

Recursion is a technique where a function calls itself with a smaller or simpler version of the original problem until a base case is reached. Every recursive solution can be rewritten iteratively, but recursion often maps more naturally to problems with self-similar structure.

## When to Use It

- Problems that can be decomposed into identical sub-problems (divide and conquer).
- Tree and graph traversals (DFS).
- Generating all combinations, permutations, or subsets.
- Mathematical sequences (Fibonacci, factorials, power functions).
- Parsing nested or hierarchical structures.

## Time and Space Complexity

| Pattern | Time | Space (call stack) |
|---------|------|--------------------|
| Linear recursion | O(n) | O(n) |
| Binary recursion (halving) | O(log n) | O(log n) |
| Tree recursion (two branches) | O(2ⁿ) without memoisation | O(n) |
| With memoisation | O(n) sub-problems × O(1) each | O(n) |

## Common Data Structures

- Call stack (implicit)
- Memo table (`HashMap` / `dict`) for top-down DP
- Trees and graphs (natural recursive structure)

## Recognition Clues

- The problem has a natural base case and a way to reduce it.
- "Compute all…" / "Generate every combination…"
- Tree/graph problems (DFS).
- Problems easily described as "the answer for n depends on the answer for n-1".

## Common Interview Problems

| Problem | Difficulty |
|---------|------------|
| Fibonacci Number | Easy |
| Power of Two / Three | Easy |
| Binary Tree Inorder Traversal | Easy |
| Merge Sort | Medium |
| Pow(x, n) | Medium |
| Decode Ways | Medium |

## Complexity Summary

| Recursion Type | Time | Space |
|----------------|------|-------|
| Tail recursion (single call) | O(n) | O(n) |
| Divide & conquer (halving) | O(n log n) | O(log n) |
| Exponential branching | O(bⁿ) | O(n) |

## References

- [LeetCode – Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)
- Cormen et al., *Introduction to Algorithms* – Recurrences chapter
