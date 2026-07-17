# 03 – Two Pointers

## Definition

The Two Pointers pattern uses two index variables that move through a data structure—typically from opposite ends toward the centre, or both from the left at different speeds—to reduce the need for nested loops.

## When to Use It

- Searching for a pair that satisfies a condition in a **sorted** array.
- Reversing an array or string in place.
- Detecting a palindrome.
- Merging two sorted arrays.
- Removing duplicates from a sorted array.
- Problems involving linked lists (cycle detection, finding the middle).

## Time and Space Complexity

| Variant | Time | Space |
|---------|------|-------|
| Opposite ends (sorted array) | O(n) | O(1) |
| Fast/slow pointers | O(n) | O(1) |
| Merge two sorted arrays | O(n + m) | O(1)–O(n+m) |

## Common Data Structures

- Sorted arrays / lists
- Strings
- Linked lists (fast/slow pointer variant)

## Recognition Clues

- The input is sorted (or can be sorted first).
- "Find a pair with a given sum / difference."
- "Remove duplicates in place."
- "Detect a cycle."
- "Find the middle of a linked list."
- "Is this string a palindrome?"

## Common Interview Problems

| Problem | Difficulty |
|---------|------------|
| Two Sum II – Input Array is Sorted | Medium |
| Valid Palindrome | Easy |
| Container With Most Water | Medium |
| 3Sum | Medium |
| Remove Duplicates from Sorted Array | Easy |
| Linked List Cycle | Easy |
| Find the Middle of a Linked List | Easy |

## Complexity Summary

| Approach | Time | Space |
|----------|------|-------|
| Brute force (nested loops) | O(n²) | O(1) |
| Two pointers | O(n) | O(1) |

## References

- [LeetCode – Two Sum II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
- [LeetCode – Container With Most Water](https://leetcode.com/problems/container-with-most-water/)
