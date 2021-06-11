/*
 * https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1227/
 */

package linked_list;

import linked_list.MyLinkedList;
import linked_list.MyLinkedList.Node;

class LinkedListMerge {

	/**
	 * Merge two sorted linked lists and return it as a sorted list. The list should
	 * be made by splicing together the nodes of the first two lists.
	 */
	public static Node mergeTwoLists(Node l1, Node l2) {
		MyLinkedList obj = new MyLinkedList();
		obj.addAtHead(0);
		Node x = obj.head;
		Node temp = x;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				x.next = l1;
				l1 = l1.next;
			} else {
				x.next = l2;
				l2 = l2.next;
			}
			x = x.next;
		}
		if (l1 != null)
			x.next = l1;
		if (l2 != null)
			x.next = l2;
		return temp.next;

	}
}
