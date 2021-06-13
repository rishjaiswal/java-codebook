/*
 * https://leetcode.com/problems/reverse-linked-list-ii/
 */

package linked_list;

import linked_list.MyLinkedList;
import linked_list.MyLinkedList.Node;

class LinkedListReverseII {

	/**
	 * Given the head of a singly linked list and two integers left and right where
	 * left <= right, reverse the nodes of the list from position left to position
	 * right, and return the reversed list.
	 * 
	 */
	public static Node reverseBetween(Node head, int left, int right) {

		if (head == null || ((right - left) == 0)) {
			return head;
		}
		MyLinkedList obj = new MyLinkedList();
		obj.addAtHead(0);
		Node fakeHead = obj.head;
		fakeHead.next = head;
		int pos = 1;
		Node start = fakeHead;
		Node curr = head;

		// go left-1 places
		while (pos < left) {
			start = curr;
			curr = curr.next;
			pos++;
		}
		Node tail = curr;
		Node prev = null;
		
		// go right places
		while (pos <= right) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			pos++;
		}
		start.next = prev;
		tail.next = curr;
		return fakeHead.next;

	}
}
