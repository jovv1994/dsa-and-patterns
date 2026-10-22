# Python Tips for Coding Interviews

Quick reference for Python-specific patterns, idioms, and standard library tools relevant to technical interviews.

---

## Useful Built-ins and Standard Library

```python
from collections import defaultdict, Counter, deque, OrderedDict
import heapq
import bisect
import itertools
import functools
```

---

## Collections

```python
# defaultdict — avoids KeyError
freq = defaultdict(int)
freq['a'] += 1

graph = defaultdict(list)
graph[node].append(neighbour)

# Counter — frequency map
from collections import Counter
c = Counter("hello")       # Counter({'l': 2, 'h': 1, 'e': 1, 'o': 1})
c.most_common(2)           # [('l', 2), ('h', 1)]

# deque — O(1) append/pop from both ends
dq = deque()
dq.appendleft(x)           # push front
dq.append(x)               # push back
dq.popleft()               # dequeue
dq.pop()                   # pop stack
```

---

## Heap (min-heap by default)

```python
import heapq

heap = []
heapq.heappush(heap, val)
smallest = heapq.heappop(heap)

# Max-heap: negate values
heapq.heappush(heap, -val)
largest = -heapq.heappop(heap)

# Heapify in place — O(n)
heapq.heapify(lst)

# n smallest/largest
heapq.nsmallest(k, lst)
heapq.nlargest(k, lst)
```

---

## Sorting

```python
lst.sort()                          # in place, O(n log n)
sorted_lst = sorted(lst)            # returns new list

# Custom key
lst.sort(key=lambda x: x[1])
lst.sort(key=lambda x: (-x[0], x[1]))  # sort by first desc, second asc

# Sort strings by length
words.sort(key=len)
```

---

## Strings

```python
s.split()            # split on any whitespace
s.split(',')         # split on comma
''.join(lst)         # join list of chars

s.strip()            # remove leading/trailing whitespace
s.lower()
s.upper()
s.isalpha()
s.isdigit()
s.isalnum()

# Reverse
s[::-1]

# Character frequency
from collections import Counter
Counter(s)
```

---

## Useful Idioms

```python
# Infinity
float('inf')
float('-inf')

# Integer division
a // b

# Power
a ** b

# Swap
a, b = b, a

# Enumerate
for i, val in enumerate(lst):
    ...

# Zip two lists
for a, b in zip(lst1, lst2):
    ...

# Dictionary get with default
d.get(key, 0)

# Comprehensions
squares = [x*x for x in range(n)]
freq = {k: v for k, v in Counter(s).items()}

# All / any
all(x > 0 for x in lst)
any(x > 0 for x in lst)
```

---

## Binary Search

```python
import bisect

bisect.bisect_left(lst, x)   # leftmost insertion point
bisect.bisect_right(lst, x)  # rightmost insertion point (default)
bisect.insort(lst, x)        # insert maintaining sorted order
```

---

## Functional Tools

```python
from functools import lru_cache

@lru_cache(maxsize=None)
def fib(n):
    if n < 2:
        return n
    return fib(n-1) + fib(n-2)

# reduce
from functools import reduce
product = reduce(lambda a, b: a * b, lst)
```

---

## Gotchas

| Pitfall | Fix |
|---------|-----|
| Mutable default argument in function | Use `None` and assign inside |
| `is` vs `==` | `is` checks identity; `==` checks equality |
| Shallow copy of list | Use `lst[:]` or `list(lst)` for shallow copy |
| Integer division `3/2 = 1.5` in Python 3 | Use `3 // 2` for floor division |
| `list.sort()` returns `None` | Don't assign: `lst.sort()`, not `lst = lst.sort()` |
| Recursion depth limit (~1000) | Use `sys.setrecursionlimit(n)` or convert to iterative |

---

## Time Complexity of Key Operations

| Operation | Container | Time |
|-----------|-----------|------|
| `append` / `pop` | `list` | O(1) amortised |
| `insert(0, x)` / `pop(0)` | `list` | O(n) |
| `appendleft` / `popleft` | `deque` | O(1) |
| `in` | `list` | O(n) |
| `in` | `set` / `dict` | O(1) avg |
| `heappush` / `heappop` | `heap` | O(log n) |
| `bisect_left` | sorted list | O(log n) |

---

## References

- [Python docs – collections](https://docs.python.org/3/library/collections.html)
- [Python docs – heapq](https://docs.python.org/3/library/heapq.html)
- [Python docs – bisect](https://docs.python.org/3/library/bisect.html)
