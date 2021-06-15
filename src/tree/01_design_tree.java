/*
 * Design a Tree data structure that supports insert, delete and search Operations
 */

package tree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int d) {
		data = d;
		left = null;
		right = null;
	}
}

class MyTree {

	public static TreeNode root;

	/** Initialize your data structure here. */
	public MyTree() {
		root = null;
	}

	/**
	 * Add a Treenode of value i to the root
	 */
	public static TreeNode insert(TreeNode root, int i) {
		TreeNode new_node = new TreeNode(i);
		System.out.println("Insertion of TreeNode " + i);
		if (root == null) {
			root = new_node;
			return root;
		}
		Queue<TreeNode> q = new LinkedList();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode curr = q.remove();

			if (curr.left == null) {
				curr.left = new_node;
				break;
			} else
				q.add(curr.left);
			if (curr.right == null) {
				curr.right = new_node;
				break;
			} else
				q.add(curr.right);
		}
		return root;
	}

	/** Print the all Tree nodes values of the Tree */
	public static void printTreeLine(TreeNode root) {

		if (root == null) {
			System.out.println("Tree is Empty");
			return;
		}
		Queue<TreeNode> q = new LinkedList();
		q.add(root);
		System.out.println("Tree is ");
		while (!q.isEmpty()) {
			int n = q.size();
			while (n > 0) {
				TreeNode curr = q.remove();
				System.out.print(curr.data + " ");
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);
				n--;
			}
		}
		System.out.println(" ");
	}

	/** Delete the Tree Node having value i in the Tree,if its present */
	public static void delete(TreeNode root, int i) {
		System.out.println("Deletion of TreeNode " + i);
		if (root == null) {
			System.out.println("Deletion is not possible as Tree is Empty");
			return;
		}
		Queue<TreeNode> q = new LinkedList();
		q.add(root);
		TreeNode curr = null;
		TreeNode keyNode = null;
		while (!q.isEmpty()) {
			curr = q.remove();
			if (curr.data == i)
				keyNode = curr;
			if (curr.left != null)
				q.add(curr.left);
			if (curr.right != null)
				q.add(curr.right);

		}
		int x = curr.data;
		delete_deepest(root, curr);
		keyNode.data = x;

	}

	public static void delete_deepest(TreeNode root, TreeNode x) {
		Queue<TreeNode> q = new LinkedList();
		q.add(root);
		TreeNode curr = null;
		while (!q.isEmpty()) {
			curr = q.remove();
			if (curr == x) {
				curr = null;
				return;
			}
			if (curr.left != null) {
				if (curr.left == x) {
					curr.left = null;
					return;
				}
				q.add(curr.left);
			}
			if (curr.right != null) {
				if (curr.right == x) {
					curr.right = null;
					return;
				}
				q.add(curr.right);
			}
		}
	}

	/** Search Tree Node having value i in the Tree */
	public static void search(TreeNode root, int i) {
		if (root == null) {
			System.out.println("Tree is Empty and having no element");
			return;
		}
		Queue<TreeNode> q = new LinkedList();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode curr = q.remove();
			if (curr.data == i) {
				System.out.println("Search Element " + i + " is Present in Tree");
				return;
			}
			if (curr.left != null) {
				q.add(curr.left);
			}
			if (curr.right != null) {
				q.add(curr.right);
			}
		}
		System.out.println("Search Element " + i + " is not Present in Tree");
	}
}
