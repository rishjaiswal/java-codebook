/*
 * https://leetcode.com/problems/reverse-nodes-in-k-group/
 */

package linked_list;

import linked_list.MyLinkedList;
import linked_list.MyLinkedList.Node;

class LinkedListReverseNodes {

	/**
	 * Given a linked list, reverse the nodes of a linked list k at a time and
	 * return its modified list.
	 * 
	 */
	public static Node reverseKGroup(Node head, int k) {
		/*
		 * [1,2,3,4,5] - 3 [3,2,1,5,4]
		 */
		if (head == null || k == 0) {
			return head;
		}
		MyLinkedList obj = new MyLinkedList();
		obj.addAtHead(0);
		Node fakeHead = obj.head;
		fakeHead.next = head;

		int pos = 1;
		Node start = fakeHead;
		Node curr = head;

		while (curr != null) {
			Node tail = curr;
			Node prev = null;
			// reverse k positions
			while (curr != null && pos <= k) {
				Node future = curr.next;
				curr.next = prev;
				prev = curr;
				curr = future;
				pos++;
			}
			pos = 1;
			start.next = prev;
			start = tail;
			tail.next = curr;
		}
		return fakeHead.next;

	}

	public static Node reverseKGroupOnly(Node head, int k) {
		/*
		 * [1,2,3,4,5] - 3 [3,2,1,4,5]
		 */

		if (head == null || k == 0) {
			return head;
		}
		MyLinkedList obj = new MyLinkedList();
		obj.addAtHead(0);
		Node fakeHead = obj.head;

		fakeHead.next = head;

		int pos = 1;
		Node start = fakeHead;
		Node curr = head;

		// Find length
		int n = 0;
		while (curr != null) {
			curr = curr.next;
			n++;
		}
		curr = head;
		int q = n / k;
		while (curr != null && q > 0) {
			Node tail = curr;
			Node prev = null;
			// reverse k positions
			while (curr != null && pos <= k) {
				Node future = curr.next;
				curr.next = prev;
				prev = curr;
				curr = future;
				pos++;
			}
			pos = 1;
			start.next = prev;
			start = tail;
			tail.next = curr;
			q--;

		}
		return fakeHead.next;

	}
}
