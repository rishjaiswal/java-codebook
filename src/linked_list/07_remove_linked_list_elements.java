/*
 * https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1207/
 */

package linked_list;

import linked_list.MyLinkedList;
import linked_list.MyLinkedList.Node;

class LinkedListRemoveElements {

	/**
	 * Given Given the head of a linked list and an integer val, remove all the
	 * nodes of the linked list that has Node.val == val, and return the new head.
	 */
	public static Node removeElements(Node head, int val) {
		// To create a output Linked list to retain header and return as a output
		MyLinkedList obj = new MyLinkedList();
		obj.addAtHead(0);
		Node output = obj.head;
		output.next = head;
		// To iterate through whole linked list
		Node curr = output;
		while (curr.next != null) {
			if (curr.next.val == val) {
				Node next = curr.next;
				curr.next = next.next;
			} else {
				curr = curr.next;
			}
		}
		return output.next;
	}
}
