/*
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */

package linked_list;

import linked_list.MyLinkedList.Node;

class LinkedListMiddle {

	/**
	 * Given a non-empty, singly linked list with head node head, return a middle
	 * node of linked list.
	 * 
	 * If there are two middle nodes, return the second middle node.
	 */
	public static Node middleNode(Node head) {

		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

}
