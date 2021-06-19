/*
 * https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/535/
 */

package tree;

import tree.*;

class MaximumDepth {

	/*
	 * Given the root of a binary tree, return its maximum depth.
	 */
	public static int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		int l = maxDepth(root.left);
		int r = maxDepth(root.right);
		if (l > r)
			return l + 1;
		else
			return r + 1;
	}
}
