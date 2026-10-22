# 01 – Iteration

## Definition

Iteration is the process of repeatedly executing a block of code using a loop (`for`, `while`, `do-while`) until a terminating condition is met. It is the most fundamental control-flow pattern and the basis for most other algorithmic patterns.

## When to Use It

- Processing every element in a sequence exactly once.
- Accumulating a running result (sum, product, min, max).
- Searching linearly through unsorted data.
- Building output collections element by element.

## Time and Space Complexity

| Operation | Time | Space |
|-----------|------|-------|
| Single loop over n elements | O(n) | O(1) |
| Nested loops (independent) | O(n²) | O(1) |
| Nested loops (dependent, e.g. triangular) | O(n²/2) = O(n²) | O(1) |

> Space is O(1) when iterating in place; O(n) if a new collection is built.

## Common Data Structures

- Arrays / Lists
- Strings (treated as character arrays)
- Linked Lists (iterative traversal)

## Recognition Clues

- "For each element…"
- "Find the sum / maximum / minimum…"
- "Count elements that satisfy a condition."
- No obvious sub-problem structure (rules out divide-and-conquer or recursion).

## Common Interview Problems

| Problem | Difficulty |
|---------|------------|
| Two Sum (brute-force) | Easy |
| Find maximum / minimum in array | Easy |
| Sum of all elements | Easy |
| Reverse a string / array | Easy |
| Check if array is sorted | Easy |
| Product of array elements | Easy |

## Complexity Summary

| Loops | Time Complexity |
|-------|----------------|
| 1 loop | O(n) |
| 2 nested loops | O(n²) |
| k nested loops | O(nᵏ) |

## References

- [Big-O Complexity Chart](https://www.bigocheatsheet.com/)
- Sedgewick & Wayne, *Algorithms* (4th ed.) – Chapter 1
