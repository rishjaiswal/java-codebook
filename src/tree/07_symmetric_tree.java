/*
 * https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/536/
 */

package tree;

import tree.*;
import java.util.LinkedList;
import java.util.Queue;

class SymmetricTree {

	/*
	 * Given the root of a binary tree, check whether it is a mirror of itself
	 * (i.e., symmetric around its center).
	 */
	public static boolean isSymmetric(TreeNode root) {
		return isMirror(root, root);
	}

	public static boolean isMirror(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null)
			return true;
		if (t1 == null || t2 == null)
			return false;
		return (t1.data == t2.data) && isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right);
	}

	public static boolean isSymmetricIterative(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode t1 = q.poll();
			TreeNode t2 = q.poll();
			if (t1 == null && t2 == null)
				continue;
			if (t1 == null || t2 == null)
				return false;
			if (t1.data != t2.data)
				return false;
			q.add(t1.left);
			q.add(t2.right);
			q.add(t1.right);
			q.add(t2.left);
		}
		return true;
	}
}
