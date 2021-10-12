# BackTracking.

- Backtracking is an algorithmic-technique for solving problems recursively by trying to build a solution incrementally, one piece at a time, removing those solutions that fail to satisfy the constraints of the problem at any point of time 

Please refer below example of backtracking :

<img src="https://miro.medium.com/max/1400/0*vuA8uW0sqyX9who6" alt="BackTracking" height="200" style="vertical-align:top; margin:4px">

- Backtracking can be applied only for problems that admit the concept of a “partial candidate solution” and a relatively quick test of whether it can be completed to a valid solution. 
- Backtracking is often much faster than brute force enumeration of all candidates since it can eliminate a large number of candidates with a single test.


The backtracking algorithms consists of the following steps:
For Example -https://leetcode.com/problems/palindrome-partitioning/

- Choose: Choose the potential candidate. Here, our potential candidates are all substrings that could be generated from the given string.

- Constraint: Define a constraint that must be satisfied by the chosen candidate. In this case, the constraint is that the string must be a palindrome.

- Goal: We must define the goal that determines if have found the required solution and we must backtrack. Here, our goal is achieved if we have reached the end of the string.