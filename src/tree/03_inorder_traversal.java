/*
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/929/
 */

package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class InOrderTraversal {

	/*
	 * Given the root of a binary tree, return the inorder traversal of its nodes'
	 * values recursively-I
	 */
	public static void inorderTraversalRecursion(TreeNode root) {
		if (root == null)
			return;
		inorderTraversalRecursion(root.left);
		System.out.print(root.data + " ");
		inorderTraversalRecursion(root.right);

	}

	/*
	 * Given the root of a binary tree, return the inorder traversal of its nodes'
	 * values recursively-II
	 */
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> al = new ArrayList();
		if (root == null)
			return al;
		al.addAll(inorderTraversal(root.left));
		al.add(root.data);
		al.addAll(inorderTraversal(root.right));
		return al;
	}

	/*
	 * Given the root of a binary tree, return the inorder traversal of its nodes'
	 * values iteratively
	 */
	public static void inorderTraversalIterative(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is Empty");
			return;
		}
		Stack<TreeNode> st = new Stack<TreeNode>();
		TreeNode curr = root;
		while (!st.isEmpty() || curr != null) {
			while (curr != null) {
				st.push(curr);
				curr = curr.left;
			}
			curr = st.pop();
			System.out.print(curr.data + " ");
			curr = curr.right;
		}
		System.out.println(" ");
	}
}
