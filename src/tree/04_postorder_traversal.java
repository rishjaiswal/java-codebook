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
		Stack<TreeNode> st1 = new Stack<TreeNode>();
		Stack<TreeNode> st2 = new Stack<TreeNode>();
		st1.add(root);
		while (!st1.isEmpty()) {
			TreeNode curr = st1.pop();
			st2.push(curr);
			if (curr.left != null)
				st1.push(curr.left);
			if (curr.right != null)
				st1.push(curr.right);
		}
		while (!st2.isEmpty()) {
			System.out.print(st2.pop().data + " ");
		}
		System.out.println(" ");
	}
}
