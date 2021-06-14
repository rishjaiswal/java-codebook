/*
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */

package linked_list;

import linked_list.MyLinkedList.Node;

class LinkedListRemoveWithoutHead {

	/**
	 * Write a function to delete a node in a singly-linked list. You will not be
	 * given access to the head of the list, instead you will be given access to the
	 * node to be deleted directly.
	 * 
	 * It is guaranteed that the node to be deleted is not a tail node in the list.
	 * 
	 */
	public static void deleteNode(Node node) {
		if (node == null)
			return;
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
