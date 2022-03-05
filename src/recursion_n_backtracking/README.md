# Recursion

Each time a recursive function calls itself, it reduces the given problem into subproblems.
The recursion call continues until it reaches a point where the subproblem can be solved without further recursion.

Here is an example:
<img src="https://static.javatpoint.com/cpages/images/recursion.png" alt="Tree" height="300" style="vertical-align:top; margin:40px">

A recursive function should have the following properties so that it does not result in an infinite loop:

- A simple base case (or cases) — a terminating scenario that does not use recursion to produce an answer.
- A set of rules, also known as recurrence relation that reduces all other cases towards the base case.


# BackTracking

- Backtracking is an algorithmic-technique for solving problems recursively by trying to build a solution incrementally, one piece at a time, removing those solutions that fail to satisfy the constraints of the problem at any point of time

Please refer below example of backtracking :

<img src="https://miro.medium.com/max/1400/0*vuA8uW0sqyX9who6" alt="BackTracking" height="200" style="vertical-align:top; margin:4px">

- Backtracking can be applied only for problems that admit the concept of a “partial candidate solution” and a relatively quick test of whether it can be completed to a valid solution.
- Backtracking is often much faster than brute force enumeration of all candidates since it can eliminate a large number of candidates with a single test.

