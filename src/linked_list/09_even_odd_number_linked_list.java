/*
 * Own Created Problem - Odd Even Number Linked List
 */

package linked_list;

import linked_list.MyLinkedList;
import linked_list.MyLinkedList.Node;

class LinkedListNumber {

	/**
	 * Given the head of a linked list , partition it such that all nodes having odd
	 * values come before nodes having even values
	 */
	public static Node oddEven(Node head) {

		MyLinkedList obj = new MyLinkedList();
		obj.addAtHead(0);
		Node even = obj.head;
		MyLinkedList obj_1 = new MyLinkedList();
		obj_1.addAtHead(1);
		Node odd = obj_1.head;
		Node even_head = even;
		Node odd_head = odd;

		while (head != null) {
			if ((head.val % 2) == 0) {
				even.next = head;
				even = even.next;
			}

			else {
				odd.next = head;
				odd = odd.next;

			}
			head = head.next;
		}
		even.next = null;
		odd.next = even_head.next;
		return odd_head.next;

	}
}
