# Java Tips for Coding Interviews

Quick reference for Java-specific patterns, idioms, and pitfalls relevant to technical interviews.

---

## Useful Collections

```java
// Resizable array
List<Integer> list = new ArrayList<>();

// Double-ended queue (use instead of Stack<>)
Deque<Integer> stack = new ArrayDeque<>();
Deque<Integer> queue = new ArrayDeque<>();

// HashMap
Map<String, Integer> map = new HashMap<>();

// TreeMap — sorted by key, O(log n) ops
Map<Integer, Integer> sorted = new TreeMap<>();

// HashSet
Set<Integer> set = new HashSet<>();

// Min-heap
PriorityQueue<Integer> minHeap = new PriorityQueue<>();

// Max-heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
```

---

## String Manipulation

```java
// Split string
String[] words = s.split(" ");

// Character array
char[] chars = s.toCharArray();

// StringBuilder (prefer over String concatenation in loops)
StringBuilder sb = new StringBuilder();
sb.append('a');
String result = sb.toString();

// Compare strings — use .equals(), not ==
s1.equals(s2);

// Character checks
Character.isLetterOrDigit(c);
Character.toLowerCase(c);
Character.toUpperCase(c);
Character.isDigit(c);
Character.isLetter(c);
```

---

## Arrays

```java
// Sort
Arrays.sort(arr);

// Sort 2D array by first column
Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

// Fill
Arrays.fill(arr, 0);

// Copy
int[] copy = Arrays.copyOf(arr, arr.length);
int[] range = Arrays.copyOfRange(arr, 1, 4); // [1, 4)

// Convert array to list
List<Integer> list = Arrays.asList(1, 2, 3);
```

---

## Integer / Math Utilities

```java
Integer.MAX_VALUE   // 2^31 - 1
Integer.MIN_VALUE   // -2^31

Math.max(a, b);
Math.min(a, b);
Math.abs(x);
Math.pow(base, exp);   // returns double
Math.sqrt(x);          // returns double

// Integer overflow — use long when needed
long product = (long) a * b;
```

---

## Common Patterns

### Iterating a Map

```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    String key = entry.getKey();
    int val = entry.getValue();
}
```

### getOrDefault

```java
map.getOrDefault(key, 0);
```

### Sorting a list of strings by length

```java
list.sort((a, b) -> a.length() - b.length());
```

### Two-dimensional array

```java
int[][] grid = new int[rows][cols];
```

---

## Gotchas

| Pitfall | Fix |
|---------|-----|
| `==` compares references for objects | Use `.equals()` |
| `Integer` overflow in subtraction comparators | Use `Integer.compare(a, b)` |
| `Stack<>` is legacy and synchronized | Use `ArrayDeque` |
| `LinkedList` has poor cache performance | Prefer `ArrayDeque` for stack/queue |
| Auto-unboxing `null` Integer causes NPE | Check for null before unboxing |

---

## Time Complexity of Key Operations

| Operation | Class | Time |
|-----------|-------|------|
| `add` / `remove` | `ArrayList` | O(1) amortised / O(n) |
| `add` / `remove` | `LinkedList` | O(1) at ends |
| `get` | `ArrayList` | O(1) |
| `get` | `LinkedList` | O(n) |
| `put` / `get` | `HashMap` | O(1) avg |
| `put` / `get` | `TreeMap` | O(log n) |
| `offer` / `poll` | `PriorityQueue` | O(log n) |
| `push` / `pop` | `ArrayDeque` | O(1) |

---

## References

- [Java Collections Framework](https://docs.oracle.com/en/java/docs/collections/)
- Effective Java, *Joshua Bloch* – Items on collections and generics
