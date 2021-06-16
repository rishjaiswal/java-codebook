/*
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/928/
 */

package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class PreOrderTraversal {

	/*
	 * Given the root of a binary tree, return the preorder traversal of its nodes'
	 * values recursively-I
	 */
	public static void preorderTraversalRecursion(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preorderTraversalRecursion(root.left);
		preorderTraversalRecursion(root.right);

	}

	/*
	 * Given the root of a binary tree, return the preorder traversal of its nodes'
	 * values recursively-II
	 */
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> al = new ArrayList();
		if (root == null)
			return al;
		al.add(root.data);
		al.addAll(preorderTraversal(root.left));
		al.addAll(preorderTraversal(root.right));
		return al;
	}

	/*
	 * Given the root of a binary tree, return the preorder traversal of its nodes'
	 * values iteratively
	 */
	public static void preorderTraversalIterative(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is Empty");
			return;
		}
		Stack<TreeNode> st = new Stack();
		st.push(root);
		while (st.empty() == false) {
			TreeNode curr = st.pop();
			System.out.print(curr.data + " ");
			if (curr.right != null)
				st.push(curr.right);
			if (curr.left != null)
				st.push(curr.left);
		}
		System.out.println(" ");
	}
}
