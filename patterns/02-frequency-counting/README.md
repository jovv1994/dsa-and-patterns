# 02 – Frequency Counting

## Definition

Frequency Counting uses a hash map (or array) to tally how many times each value appears in a collection. This avoids nested loops by trading O(n) extra space for an O(n) time solution instead of O(n²).

## When to Use It

- Checking if two collections have the same elements (anagram detection).
- Finding duplicates or unique elements.
- Comparing two arrays element-by-element without sorting.
- Problems that ask "how many times does X appear?"

## Time and Space Complexity

| Step | Time | Space |
|------|------|-------|
| Build frequency map | O(n) | O(n) |
| Look up a key | O(1) average | – |
| Overall (typical) | O(n) | O(n) |

> When the value domain is bounded (e.g., lowercase letters), the map can be replaced with an array of fixed size, reducing constant factors.

## Common Data Structures

- `HashMap` / `dict`
- `int[]` / `list` (when domain is small and known)
- `HashSet` / `set` (for existence checks only)

## Recognition Clues

- "Is one array a permutation/anagram of another?"
- "Find all duplicates."
- "Count occurrences."
- "Do two strings contain the same characters?"
- Comparing two things that should match up, but order may differ.

## Common Interview Problems

| Problem | Difficulty |
|---------|------------|
| Valid Anagram | Easy |
| Contains Duplicate | Easy |
| Find All Duplicates in an Array | Medium |
| Top K Frequent Elements | Medium |
| First Unique Character in a String | Easy |
| Intersection of Two Arrays | Easy |

## Complexity Summary

| Approach | Time | Space |
|----------|------|-------|
| Brute force (nested loops) | O(n²) | O(1) |
| Frequency counting | O(n) | O(n) |
| Sort then compare | O(n log n) | O(1)–O(n) |

## References

- [LeetCode – Valid Anagram](https://leetcode.com/problems/valid-anagram/)
- [LeetCode – Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)
