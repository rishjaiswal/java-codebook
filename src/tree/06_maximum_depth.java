/*
 * https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/535/
 */

package tree;

import tree.*;
import java.util.LinkedList;
import java.util.Queue;

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

	public static int maxDepthIterative(TreeNode root) {

		// Base Case
		if (root == null)
			return 0;

		// Create an empty queue for level order tarversal
		Queue<TreeNode> q = new LinkedList<TreeNode>();

		// Enqueue Root and initialize height
		q.add(root);
		int height = 0;

		while (1 == 1) {
			// nodeCount (queue size) indicates number of nodes
			// at current lelvel.
			int nodeCount = q.size();
			if (nodeCount == 0)
				return height;
			height++;

			// Dequeue all nodes of current level and Enqueue all
			// nodes of next level
			while (nodeCount > 0) {
				TreeNode newnode = q.poll();
				if (newnode.left != null)
					q.add(newnode.left);
				if (newnode.right != null)
					q.add(newnode.right);
				nodeCount--;
			}
		}
	}
}
