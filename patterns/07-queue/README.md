# 07 – Queue

## Definition

A Queue is a First-In, First-Out (FIFO) data structure. Elements are enqueued at the rear and dequeued from the front. It is the natural data structure for level-by-level (breadth-first) processing.

## When to Use It

- Breadth-First Search (BFS) on trees or graphs.
- Level-order traversal of a tree.
- Processing items in arrival order (task scheduling, print queues).
- Sliding window maximum (monotonic deque).
- Implementing caches (e.g., FIFO eviction).

## Time and Space Complexity

| Operation | Time | Space |
|-----------|------|-------|
| Enqueue | O(1) | – |
| Dequeue | O(1) | – |
| Peek (front) | O(1) | – |
| BFS traversal | O(V + E) | O(V) |
| Overall space | – | O(n) |

> V = vertices, E = edges (for graph/tree BFS).

## Common Data Structures

- `ArrayDeque` / `LinkedList` (Java)
- `collections.deque` (Python)
- `PriorityQueue` / `heapq` — when ordering by priority is needed

## Recognition Clues

- "Level by level…" or "layer by layer…"
- "Shortest path in an unweighted graph."
- "Process nodes at the same depth together."
- "First task in, first task out."
- BFS problems on grids (flood fill, word ladder).

## Common Interview Problems

| Problem | Difficulty |
|---------|------------|
| Binary Tree Level Order Traversal | Medium |
| Rotting Oranges | Medium |
| Word Ladder | Hard |
| Number of Islands (BFS variant) | Medium |
| Sliding Window Maximum | Hard |
| Implement Queue using Stacks | Easy |

## Complexity Summary

| Algorithm | Time | Space |
|-----------|------|-------|
| BFS | O(V + E) | O(V) |
| Level-order traversal | O(n) | O(n) |
| Sliding window max (deque) | O(n) | O(k) |

## References

- [LeetCode – Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)
- [LeetCode – Rotting Oranges](https://leetcode.com/problems/rotting-oranges/)
