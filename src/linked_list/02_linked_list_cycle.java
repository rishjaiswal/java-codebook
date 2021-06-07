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

	/*
	 * Once the slow/fast pointer meets, it becomes a math problem.
	 */
	public static boolean hasCycleApproach(Node head) {

		if (head == null || head.next == null) {
			return false;
		}
		Node slow = head;
		Node fast = head.next;
		while (slow != null && fast.next != null && fast.next.next != null) {
			if (slow == fast)
				return true;
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;

	}
	
	public static boolean hasCycleSecondApproach(Node head) {

		Node slow = head;
		Node fast = head;
		/**
		 * Change this condition to fit specific problem. Attention: remember to avoid
		 * null-pointer error
		 **/
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next; // move slow pointer one step each time
			fast = fast.next.next; // move fast pointer two steps each time
			if (slow == fast) { // change this condition to fit specific problem
				return true;
			}
		}
		return false; // change return value to fit specific problem

	}

}
