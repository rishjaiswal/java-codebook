/*
 * https://leetcode.com/problems/partition-list/
 */

package linked_list;

import linked_list.MyLinkedList;
import linked_list.MyLinkedList.Node;

class LinkedListPartition {

	/**
	 * Given the head of a linked list and a value x, partition it such that all
	 * nodes less than x come before nodes greater than or equal to x.
	 */
	public static Node partition(Node head, int x) {

		MyLinkedList obj = new MyLinkedList();
		obj.addAtHead(0);
		Node first = obj.head;
		MyLinkedList obj_1 = new MyLinkedList();
		obj_1.addAtHead(1);
		Node last = obj_1.head;
		Node temp = first;
		Node temp1 = last;
		while (head != null) {
			if (head.val < x) {
				first.next = head;
				first = first.next;
			} else {
				last.next = head;
				last = last.next;
			}
			head = head.next;
		}
		last.next = null;
		first.next = temp1.next;

		return temp.next;

	}
}
