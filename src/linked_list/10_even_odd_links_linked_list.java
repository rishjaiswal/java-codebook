/*
 * https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1208/
 */

package linked_list;

import linked_list.MyLinkedList;
import linked_list.MyLinkedList.Node;

class LinkedListLinks {

	/**
	 * Given the head of a singly linked list, group all the nodes with odd indices
	 * together followed by the nodes with even indices, and return the reordered
	 * list.
	 */
	public static Node oddEvenLinks(Node head) {

		MyLinkedList obj = new MyLinkedList();
		obj.addAtHead(0);
		Node even = obj.head;
		MyLinkedList obj_1 = new MyLinkedList();
		obj_1.addAtHead(1);
		Node odd = obj_1.head;
		Node even_head = even;
		Node odd_head = odd;
		boolean flag = false;
		while (head != null) {
			if (flag) {
				even.next = head;
				even = even.next;
			}

			else {
				odd.next = head;
				odd = head;

			}
			head = head.next;
			flag = !flag;
		}
		even.next = null;
		odd.next = even_head.next;
		return odd_head.next;

	}
}
