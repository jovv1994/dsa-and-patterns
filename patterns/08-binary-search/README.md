# 08 – Binary Search

## Definition

Binary Search repeatedly halves a **sorted** search space to find a target value or boundary in O(log n) time. The key insight is that each comparison eliminates half the remaining candidates.

## When to Use It

- Searching a sorted array for an exact value.
- Finding the leftmost / rightmost position satisfying a condition.
- Minimising the maximum (or maximising the minimum) over a monotone answer space.
- Searching on the answer (e.g., "find the minimum capacity that works").

## Time and Space Complexity

| Variant | Time | Space |
|---------|------|-------|
| Classic binary search | O(log n) | O(1) |
| Search on answer space | O(log(max) × f(n)) | O(1) |
| Recursive binary search | O(log n) | O(log n) call stack |

## Common Data Structures

- Sorted arrays / lists
- Implicit sorted spaces (integer ranges, answer spaces)
- Rotated sorted arrays (modified binary search)

## Recognition Clues

- The input is sorted (or the answer space is monotone).
- "Find the position of…" / "Find the first/last occurrence of…"
- "Minimum X such that condition Y holds."
- O(n) search is too slow—you need O(log n).

## Common Interview Problems

| Problem | Difficulty |
|---------|------------|
| Binary Search (classic) | Easy |
| Find Minimum in Rotated Sorted Array | Medium |
| Search in Rotated Sorted Array | Medium |
| Koko Eating Bananas | Medium |
| Median of Two Sorted Arrays | Hard |
| Find Peak Element | Medium |

## Complexity Summary

| Approach | Time | Space |
|----------|------|-------|
| Linear scan | O(n) | O(1) |
| Binary search | O(log n) | O(1) |
| Search on answer | O(log(range) × cost) | O(1) |

## References

- [LeetCode – Binary Search](https://leetcode.com/problems/binary-search/)
- [LeetCode – Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)
