# 11 – Trees

## Definition

A tree is a connected, acyclic graph with a designated root node. Each node has zero or more child nodes. Binary trees (at most two children) are the most common tree type in interviews. Trees arise naturally in hierarchical data and are the basis for many efficient data structures.

## When to Use It

- Hierarchical data representation (file systems, HTML DOM).
- Binary Search Trees for sorted data with O(log n) operations.
- Heaps (priority queues).
- Trie for prefix/string matching.
- Segment trees and Fenwick trees for range queries.

## Time and Space Complexity

| Operation | BST (balanced) | BST (skewed) |
|-----------|---------------|--------------|
| Insert | O(log n) | O(n) |
| Delete | O(log n) | O(n) |
| Search | O(log n) | O(n) |
| Traversal | O(n) | O(n) |
| Space | O(n) | O(n) |

> Balanced BSTs (AVL, Red-Black) guarantee O(log n) by maintaining height balance.

## Common Data Structures

- Binary Tree node (`left`, `right`, `val`)
- Binary Search Tree
- Heap / Priority Queue
- Trie (prefix tree)

## Recognition Clues

- "Traverse all nodes…" (inorder, preorder, postorder, level-order).
- "Find the lowest common ancestor."
- "Is this tree balanced / symmetric / valid BST?"
- "Maximum depth / diameter / path sum."
- Hierarchical or prefix-based problems.

## Common Interview Problems

| Problem | Difficulty |
|---------|------------|
| Maximum Depth of Binary Tree | Easy |
| Invert Binary Tree | Easy |
| Validate Binary Search Tree | Medium |
| Lowest Common Ancestor of a BST | Medium |
| Binary Tree Maximum Path Sum | Hard |
| Serialize and Deserialize Binary Tree | Hard |
| Implement Trie | Medium |

## Complexity Summary

| Traversal | Time | Space |
|-----------|------|-------|
| DFS (recursive) | O(n) | O(h) – h = height |
| BFS (level-order) | O(n) | O(w) – w = max width |
| Balanced tree height | O(log n) | – |
| Skewed tree height | O(n) | – |

## References

- [LeetCode – Binary Tree problems](https://leetcode.com/tag/binary-tree/)
- Sedgewick & Wayne, *Algorithms* (4th ed.) – Chapter 3 (BSTs)
