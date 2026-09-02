# 05 – HashMap

## Definition

A HashMap (hash table) stores key-value pairs with O(1) average-case insertion, deletion, and lookup. It is one of the most versatile data structures for interview problems because it replaces costly linear searches with near-constant-time retrieval.

## When to Use It

- Caching previously computed results (memoisation).
- Grouping or categorising elements (e.g., grouping anagrams).
- Counting occurrences (see also: Frequency Counting pattern).
- Checking membership in O(1).
- Mapping relationships between two sets of data.

## Time and Space Complexity

| Operation | Average | Worst Case |
|-----------|---------|------------|
| Insert | O(1) | O(n) |
| Delete | O(1) | O(n) |
| Lookup | O(1) | O(n) |
| Space | O(n) | O(n) |

> Worst case occurs with many hash collisions (rare with good hash functions).

## Common Data Structures

- `HashMap<K, V>` (Java) / `dict` (Python)
- `HashSet<K>` (Java) / `set` (Python) — for membership only
- `LinkedHashMap` / `collections.OrderedDict` — when insertion order matters
- `TreeMap` / `SortedDict` — when sorted order matters (O(log n) ops)

## Recognition Clues

- "Find two elements that sum to target."
- "Group items by a common property."
- "Have you seen this value before?"
- Needing O(1) lookup after an initial O(n) build phase.
- Problems with pairs, complements, or indices.

## Common Interview Problems

| Problem | Difficulty |
|---------|------------|
| Two Sum | Easy |
| Group Anagrams | Medium |
| Subarray Sum Equals K | Medium |
| Longest Consecutive Sequence | Medium |
| LRU Cache | Medium |
| Four Sum II | Medium |

## Complexity Summary

| Approach | Time | Space |
|----------|------|-------|
| Linear scan for every query | O(n²) | O(1) |
| HashMap build + lookup | O(n) | O(n) |

## References

- [LeetCode – Two Sum](https://leetcode.com/problems/two-sum/)
- [LeetCode – Group Anagrams](https://leetcode.com/problems/group-anagrams/)
