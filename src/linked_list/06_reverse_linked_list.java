/*
 * https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1205/
 */

package linked_list;

import linked_list.MyLinkedList.Node;

class LinkedListReverse {

	/**
	 * Given the head of a singly linked list, reverse the list, and return the
	 * reversed list.
	 */
	public static Node reverseList(Node head) {

		Node prev = null;
		Node curr = head;
		Node forward = head;
		while (curr != null) {
			forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		return prev;
	}

}
