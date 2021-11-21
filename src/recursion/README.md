# Recursion

Recursion is an important concept in computer science. It is a foundation for many other algorithms and data structures. However, the concept of recursion can be tricky to grasp for many beginners.

Here is an example:
<img src="https://static.javatpoint.com/cpages/images/recursion.png" alt="Tree" height="300" style="vertical-align:top; margin:40px">

- What is recursion? How does it work?
- How to solve a problem recursively?
- How to analyze the time and space complexity of a recursive algorithm?
- How can we apply recursion in a better way?

## Recursive Methodology :

Each time a recursive function calls itself, it reduces the given problem into subproblems.
The recursion call continues until it reaches a point where the subproblem can be solved without further recursion.

A recursive function should have the following properties so that it does not result in an infinite loop:

- A simple base case (or cases) — a terminating scenario that does not use recursion to produce an answer.
- A set of rules, also known as recurrence relation that reduces all other cases towards the base case.
