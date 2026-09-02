# Complexity Reference

A quick reference for Big-O notation and the complexity of common algorithms and data structures.

---

## Big-O Growth Rates (slowest to fastest)

| Notation | Name | n = 10 | n = 100 | n = 1 000 |
|----------|------|--------|---------|-----------|
| O(1) | Constant | 1 | 1 | 1 |
| O(log n) | Logarithmic | 3 | 7 | 10 |
| O(n) | Linear | 10 | 100 | 1 000 |
| O(n log n) | Linearithmic | 33 | 664 | 9 966 |
| O(n²) | Quadratic | 100 | 10 000 | 1 000 000 |
| O(2ⁿ) | Exponential | 1 024 | 10³⁰ | 10³⁰⁰ |
| O(n!) | Factorial | 3 628 800 | ∞ | ∞ |

---

## Common Data Structure Operations

| Data Structure | Access | Search | Insert | Delete |
|----------------|--------|--------|--------|--------|
| Array | O(1) | O(n) | O(n) | O(n) |
| Linked List | O(n) | O(n) | O(1)* | O(1)* |
| Stack | O(n) | O(n) | O(1) | O(1) |
| Queue | O(n) | O(n) | O(1) | O(1) |
| Hash Table | O(1)† | O(1)† | O(1)† | O(1)† |
| BST (balanced) | O(log n) | O(log n) | O(log n) | O(log n) |
| BST (skewed) | O(n) | O(n) | O(n) | O(n) |
| Heap | O(n) | O(n) | O(log n) | O(log n) |

\* At a known node. † Average case.

---

## Sorting Algorithm Comparison

| Algorithm | Best | Average | Worst | Space | Stable? |
|-----------|------|---------|-------|-------|---------|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) | No |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) | Yes |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) | No |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) | O(1) | No |
| Tim Sort | O(n) | O(n log n) | O(n log n) | O(n) | Yes |
| Counting Sort | O(n+k) | O(n+k) | O(n+k) | O(k) | Yes |
| Radix Sort | O(nk) | O(nk) | O(nk) | O(n+k) | Yes |

---

## Graph Algorithm Complexity

| Algorithm | Time | Space | Notes |
|-----------|------|-------|-------|
| BFS | O(V + E) | O(V) | Shortest path, unweighted |
| DFS | O(V + E) | O(V) | Cycle detection, connectivity |
| Dijkstra | O((V+E) log V) | O(V) | Non-negative weights |
| Bellman-Ford | O(V × E) | O(V) | Handles negative weights |
| Floyd-Warshall | O(V³) | O(V²) | All-pairs shortest path |
| Topological Sort | O(V + E) | O(V) | DAGs only |
| Union-Find | O(α(n)) per op | O(V) | Connected components |

---

## Recurrence Relations (Master Theorem Quick Ref)

T(n) = a·T(n/b) + O(nᶜ)

| Condition | Result |
|-----------|--------|
| c < log_b(a) | O(n^log_b(a)) |
| c = log_b(a) | O(nᶜ log n) |
| c > log_b(a) | O(nᶜ) |

**Common examples:**

| Algorithm | Recurrence | Complexity |
|-----------|-----------|------------|
| Binary Search | T(n) = T(n/2) + O(1) | O(log n) |
| Merge Sort | T(n) = 2T(n/2) + O(n) | O(n log n) |
| Quick Sort (avg) | T(n) = 2T(n/2) + O(n) | O(n log n) |

---

## Space Complexity Notes

- **Auxiliary space**: extra space used by the algorithm, excluding input.
- **Total space**: input size + auxiliary space.
- Recursive algorithms use O(depth) call-stack space implicitly.
- Converting recursion to iteration can reduce stack space to O(1).
