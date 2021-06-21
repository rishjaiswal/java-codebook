/*
 * https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/537/
 */

package tree;

import tree.*;
import java.util.LinkedList;
import java.util.Queue;

class PathSum {

	/*
	 * Given the root of a binary tree and an integer targetSum, return true if the
	 * tree has a root-to-leaf path such that adding up all the values along the
	 * path equals targetSum. A leaf is a node with no children.
	 */
	public static boolean hasPathSum(TreeNode root, int sum) {

		if (root == null)
			return false;
		if (root.data == sum && root.left == null && root.right == null)
			return true;
		return (hasPathSum(root.left, sum - root.data) || hasPathSum(root.right, sum - root.data));

	}
}
