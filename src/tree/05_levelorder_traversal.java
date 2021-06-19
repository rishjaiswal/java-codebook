/*
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/931/
 */

package tree;

import tree.*;
import java.util.LinkedList;
import java.util.Queue;

class LevelOrderTraversal {

	/*
	 * Given the root of a binary tree, return the levelorder traversal of its nodes
	 * values recursively
	 * 
	 * Time Complexity - O(n2) For a skewed tree printCurrentLevel() takes o(n) So
	 * time complexity of levelorderTraversalRecursion() is O(n) + O(n-1) +....O(1)
	 * = O(n2)
	 */
	public static void levelorderTraversalRecursion(TreeNode root) {
		int height = getHeight(root);
		for (int level = 1; level <= height; level++) {
			printCurrentLevel(root, level);
		}
	}

	public static int getHeight(TreeNode root) {
		if (root == null)
			return 0;
		int l = getHeight(root.left);
		int r = getHeight(root.right);
		if (l > r)
			return l + 1;
		else
			return r + 1;
	}

	public static void printCurrentLevel(TreeNode root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1) {
			printCurrentLevel(root.left, level - 1);
			printCurrentLevel(root.right, level - 1);
		}
	}

	/*
	 * Given the root of a binary tree, return the levelorder traversal of its
	 * nodes' values iteratively
	 */
	public static void levelorderTraversalIterative(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is Empty");
			return;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode tempNode = queue.poll();
			System.out.print(tempNode.data + " ");

			/* Enqueue left child */
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}

			/* Enqueue right child */
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
		System.out.println(" ");
	}
}
