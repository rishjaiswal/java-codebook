/*
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/930/
 */

package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class PostOrderTraversal {

	/*
	 * Given the root of a binary tree, return the postorder traversal of its nodes'
	 * values recursively-I
	 */
	public static void postorderTraversalRecursion(TreeNode root) {
		if (root == null)
			return;
		postorderTraversalRecursion(root.left);
		postorderTraversalRecursion(root.right);
		System.out.print(root.data + " ");
	}

	/*
	 * Given the root of a binary tree, return the postorder traversal of its nodes'
	 * values recursively-II
	 */
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> al = new ArrayList();
		if (root == null)
			return al;
		al.addAll(postorderTraversal(root.left));
		al.addAll(postorderTraversal(root.right));
		al.add(root.data);
		return al;
	}

	/*
	 * Given the root of a binary tree, return the postorder traversal of its nodes'
	 * values iteratively
	 */
	public static void postorderTraversalIterative(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is Empty");
			return;
		}
		System.out.println("To-Do Implementation of Iterative Approach ");
	}
}
