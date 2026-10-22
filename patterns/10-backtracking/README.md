# 10 – Backtracking

## Definition

Backtracking is an algorithmic technique that builds candidates for a solution incrementally and **abandons** (backtracks) a candidate as soon as it determines the candidate cannot lead to a valid solution. It is essentially depth-first search with pruning.

## When to Use It

- Generating all valid combinations, permutations, or subsets.
- Constraint satisfaction problems (Sudoku, N-Queens).
- Finding all paths in a graph or maze.
- Word search on a grid.
- Problems where you must explore a decision tree exhaustively.

## Time and Space Complexity

| Problem Type | Time (worst case) | Space |
|--------------|-------------------|-------|
| Subsets of n elements | O(2ⁿ) | O(n) |
| Permutations of n elements | O(n!) | O(n) |
| Combinations C(n,k) | O(C(n,k) × k) | O(k) |
| With effective pruning | Much less than worst case | O(depth) |

> Backtracking is exponential in theory, but pruning makes it practical for moderate input sizes.

## Common Data Structures

- Recursion call stack
- Boolean visited array (for graph problems)
- Temporary result list (current path / partial solution)

## Recognition Clues

- "Find ALL valid…" / "Generate ALL…"
- Constraint satisfaction (place without conflicting).
- Decision at each step with the ability to undo it.
- Brute force is expressed as a decision tree.

## Common Interview Problems

| Problem | Difficulty |
|---------|------------|
| Subsets | Medium |
| Permutations | Medium |
| Combination Sum | Medium |
| N-Queens | Hard |
| Sudoku Solver | Hard |
| Word Search | Medium |

## Complexity Summary

| Pattern | Time | Space |
|---------|------|-------|
| All subsets | O(2ⁿ × n) | O(n) |
| All permutations | O(n! × n) | O(n) |
| All combinations of size k | O(C(n,k) × k) | O(k) |

## References

- [LeetCode – Subsets](https://leetcode.com/problems/subsets/)
- [LeetCode – N-Queens](https://leetcode.com/problems/n-queens/)
