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
		System.out.println(" ");
		System.out.println("In-Order Traversal of Tree Iteratively");
		InOrderTraversal.inorderTraversalIterative(root);
		System.out.println("In-Order Traversal of Tree Recursively");
		InOrderTraversal.inorderTraversalRecursion(root);
		System.out.println(" ");
		System.out.println("Post-Order Traversal of Tree Iteratively");
		PostOrderTraversal.postorderTraversalIterative(root);
		System.out.println("Post-Order Traversal of Tree Recursively");
		PostOrderTraversal.postorderTraversalRecursion(root);
		System.out.println(" ");
		System.out.println("Level-Order Traversal of Tree Iteratively");
		LevelOrderTraversal.levelorderTraversalIterative(root);
		System.out.println("Level-Order Traversal of Tree Recursively");
		LevelOrderTraversal.levelorderTraversalRecursion(root);
		System.out.println(" ");
		System.out.println("Depth of Binary Tree is "+ MaximumDepth.maxDepth(root));
		root = MyTree.insert(root, 11);
		root = MyTree.insert(root, 12);
		root = MyTree.insert(root, 13);
		root = MyTree.insert(root, 14);
		System.out.println("Level-Order Traversal of Tree after Insertion");
		LevelOrderTraversal.levelorderTraversalIterative(root);
		System.out.println("Depth of Binary Tree after Insertion is "+ MaximumDepth.maxDepthIterative(root));
	}
}