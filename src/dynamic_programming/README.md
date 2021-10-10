# Dynamic Programming.

- A Dynamic programming a method for solving a complex problem by breaking it down into a collection of simpler subproblems, solving each of those subproblems just once, and storing their solutions.
- The next time the same subproblem occurs, instead of recomputing its solution, one simply looks up the previously computed solution, thereby saving computation time.
- This technique of storing solutions to subproblems instead of recomputing them is called memoization.

Please refer below example of Dynamic Programming (DP) :

<img src="https://assets.leetcode.com/users/bhaveshm/image_1590354633.png" alt="DP" height="200" style="vertical-align:top; margin:4px">

https://leetcode.com/problems/max-dot-product-of-two-subsequences/discuss/648528/Common-DP-pattern-with-diagram-explanation-QandA/554689/

- Types of DP are : a) Bottom- up b) Top-Down


- To approach a Dynamic Programming Problem In Interview:
- Identify the Pattern and type of Problem
- Identify the Base Cases
- Create a Recursive Solution and check for Overlapping Sub Problems
- Check for changing Parameters and Store the subproblems in a Table