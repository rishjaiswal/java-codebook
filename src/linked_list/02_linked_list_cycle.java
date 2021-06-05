/*
 * https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1212/
 */

package linked_list;

import linked_list.MyLinkedList.Node;

class LinkedListCycle {

	/**
	 * Given head, the head of a linked list, determine if the linked list has a
	 * cycle in it. Return true if there is a cycle in the linked list. Otherwise,
	 * return false.
	 */
	public static boolean hasCycle(Node head) {

		if (head == null)
			return false;

		Node slow = head;
		Node fast = head.next;
		while (slow != fast) {
			if (fast == null || fast.next == null)
				return false;
			fast = fast.next.next;
			slow = slow.next;

		}
		return true;

	}

}
