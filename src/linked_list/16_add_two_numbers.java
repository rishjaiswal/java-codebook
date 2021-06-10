/*
 * https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1228/
 */

package linked_list;

import linked_list.MyLinkedList;
import linked_list.MyLinkedList.Node;

class LinkedListAdd {

	/**
	 * You are given two non-empty linked lists representing two non-negative
	 * integers. The digits are stored in reverse order, and each of their nodes
	 * contains a single digit. Add the two numbers and return the sum as a linked
	 * list.
	 * 
	 * You may assume the two numbers do not contain any leading zero, except the
	 * number 0 itself
	 */
	public static Node addTwoNumbers(Node l1, Node l2) {
		MyLinkedList obj = new MyLinkedList();
		obj.addAtHead(0);
		Node x = obj.head;
		Node temp = x;

		int rem = 0;
		int sum = 0;
		while (l1 != null || l2 != null) {
			int x1 = (l1 != null) ? l1.val : 0;
			int y1 = (l2 != null) ? l2.val : 0;
			sum = (x1 + y1 + rem) % 10;
			rem = (x1 + y1 + rem) / 10;
			obj.addAtTail(sum);
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
			x = x.next;
		}
		if (rem == 1) {
			obj.addAtTail(rem);
		}
		return temp.next;
	}
}
