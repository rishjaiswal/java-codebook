/*
 * https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1214/
 */

package linked_list;

import linked_list.MyLinkedList.Node;

class LinkedListCycleNode {

	/**
	 * Given a linked list, return the node where the cycle begins. If there is no
	 * cycle, return null.
	 * 
	 */
	public static Node detectCycleNode(Node head) {

		if (head == null)
			return null;

		Node slow = head;
		Node fast = head.next;
		while (slow != fast) {
			if (fast == null || fast.next == null)
				return null;
			fast = fast.next.next;
			slow = slow.next;

		}
		while (head != slow.next) {
			slow = slow.next;
			head = head.next;
		}

		return head;

	}

}
