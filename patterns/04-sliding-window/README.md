# 04 – Sliding Window

## Definition

The Sliding Window pattern maintains a contiguous sub-array (or sub-string) of variable or fixed size as a "window" that slides across the input. Instead of recomputing the window's property from scratch on every step, only the elements that enter or leave the window are processed.

## When to Use It

- Finding the maximum/minimum sum sub-array of size k.
- Longest sub-string with at most k distinct characters.
- Smallest sub-array with a sum ≥ target.
- Any problem asking for an optimal contiguous subrange.

## Time and Space Complexity

| Variant | Time | Space |
|---------|------|-------|
| Fixed-size window | O(n) | O(1) |
| Variable-size window | O(n) | O(1)–O(k) |
| Window with frequency map | O(n) | O(k) |

> Each element enters the window once and leaves once, giving O(n) overall regardless of window size.

## Common Data Structures

- Arrays / Lists
- Strings
- `HashMap` / `dict` (for character/element counts inside the window)
- `Deque` (for sliding window maximum)

## Recognition Clues

- "Contiguous sub-array / sub-string…"
- "Longest / shortest window that satisfies…"
- "Maximum sum of exactly k elements."
- Brute force requires O(n²) because of nested loops over every possible window.

## Common Interview Problems

| Problem | Difficulty |
|---------|------------|
| Maximum Sum Subarray of Size K | Easy |
| Longest Substring Without Repeating Characters | Medium |
| Minimum Window Substring | Hard |
| Longest Substring with At Most K Distinct Characters | Medium |
| Fruit Into Baskets | Medium |
| Sliding Window Maximum | Hard |

## Complexity Summary

| Approach | Time | Space |
|----------|------|-------|
| Brute force | O(n²) or O(n³) | O(1) |
| Sliding window | O(n) | O(1)–O(k) |

## References

- [LeetCode – Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
- [LeetCode – Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)
