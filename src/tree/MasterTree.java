package tree;

import tree.*;

public class MasterTree {

	public static void main(String args[]) {
		System.out.println("Start execution of the Tree programs");
		System.out.println("Start Binary Tree Execution for insert, delete and search Operations");
		TreeNode root = MyTree.root;
		MyTree.printTreeLine(root);
		root = MyTree.insert(root, 5);
		MyTree.printTreeLine(root);
		root = MyTree.insert(root, 4);
		MyTree.printTreeLine(root);
		root = MyTree.insert(root, 6);
		MyTree.printTreeLine(root);
		root = MyTree.insert(root, 3);
		MyTree.printTreeLine(root);
		root = MyTree.insert(root, 7);
		MyTree.printTreeLine(root);
		root = MyTree.insert(root, 1);
		MyTree.printTreeLine(root);
		root = MyTree.insert(root, 8);
		MyTree.printTreeLine(root);
		MyTree.search(root, 5);
		MyTree.delete(root, 6);
		MyTree.printTreeLine(root);
		MyTree.delete(root, 4);
		MyTree.printTreeLine(root);
		MyTree.delete(root, 5);
		MyTree.printTreeLine(root);
		MyTree.search(root, 5);
		System.out.println("Completion of Binary Tree Execution for insert, delete and search Operations");
		System.out.println("Traversal of Tree Operations");
		System.out.println("Pre-Order Traversal of Tree Iteratively");
		PreOrderTraversal.preorderTraversalIterative(root);
		System.out.println("Pre-Order Traversal of Tree Recursively");
		PreOrderTraversal.preorderTraversalRecursion(root);
	}
}