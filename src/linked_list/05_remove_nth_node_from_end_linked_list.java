/*
 * https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1296/
 */

package linked_list;

import linked_list.MyLinkedList.Node;

class LinkedListRemove {

	/**
	 * Given the head of a linked list, remove the nth node from the end of the list
	 * and return its head.
	 */
	public static Node removeNthFromEnd(Node head, int n) {

		Node fast = head;
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}
		// Remove Head of The linked list i.e. First index of Linked List
		if (fast == null)
			return head.next;
		Node slow = head;
		Node prev = head;
		while (fast != null) {
			fast = fast.next;
			prev = slow;
			slow = slow.next;
		}
		prev.next = slow.next;
		return head;

	}

}
