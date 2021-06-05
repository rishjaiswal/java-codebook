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
		/*
		 * 1. just like in Linked List Cycle. Keep looking. If found a slow==fast, break
		 * the 1st while loop. 
		 * 2. At that moment, the slow is not the cycle starting
		 * point. We need to look for it There must be some proof within the 2nd step,
		 * which i dont know. SO, need sort of remember it: When head == slow.next, then
		 * head is the cycle starting point .... (not exactly sure why. I guess this is
		 * why it's a hard question)
		 */

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
