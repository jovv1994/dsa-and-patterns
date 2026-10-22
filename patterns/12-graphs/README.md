# 12 – Graphs

## Definition

A graph is a collection of **vertices** (nodes) connected by **edges**. Edges can be directed or undirected, weighted or unweighted. Graphs generalise trees and are used to model networks, relationships, and state spaces.

## When to Use It

- Shortest path problems (BFS for unweighted, Dijkstra for weighted).
- Detecting cycles.
- Topological sorting of dependencies.
- Connected components (union-find or DFS/BFS).
- Grid/maze problems (treat each cell as a vertex).
- Social networks, dependency graphs, scheduling.

## Time and Space Complexity

| Algorithm | Time | Space |
|-----------|------|-------|
| BFS / DFS | O(V + E) | O(V) |
| Dijkstra (min-heap) | O((V + E) log V) | O(V) |
| Bellman-Ford | O(V × E) | O(V) |
| Topological Sort (Kahn's) | O(V + E) | O(V) |
| Union-Find (path compression) | O(α(n)) per op | O(V) |

> V = vertices, E = edges, α = inverse Ackermann function (effectively constant).

## Common Data Structures

- Adjacency list (`List<List<Integer>>` / `dict of lists`)
- Adjacency matrix (dense graphs)
- `visited` set / boolean array
- `Union-Find` / Disjoint Set Union (DSU)
- Min-heap / `PriorityQueue` (Dijkstra)

## Recognition Clues

- "Find the shortest path between A and B."
- "Is there a cycle?"
- "How many connected components?"
- "Can you complete all courses?" (dependency / topological order).
- Grid problems with 4-directional or 8-directional movement.
- "Islands", "regions", "clusters".

## Common Interview Problems

| Problem | Difficulty |
|---------|------------|
| Number of Islands | Medium |
| Course Schedule | Medium |
| Clone Graph | Medium |
| Pacific Atlantic Water Flow | Medium |
| Word Ladder | Hard |
| Cheapest Flights Within K Stops | Medium |
| Network Delay Time | Medium |

## Complexity Summary

| Algorithm | Time | Space | Use Case |
|-----------|------|-------|----------|
| BFS | O(V + E) | O(V) | Shortest path (unweighted) |
| DFS | O(V + E) | O(V) | Cycle detection, connectivity |
| Dijkstra | O((V+E) log V) | O(V) | Shortest path (non-neg weights) |
| Bellman-Ford | O(V × E) | O(V) | Shortest path (neg weights) |
| Topological Sort | O(V + E) | O(V) | Dependency ordering |

## References

- [LeetCode – Graph problems](https://leetcode.com/tag/graph/)
- Cormen et al., *Introduction to Algorithms* – Part VI (Graph Algorithms)
