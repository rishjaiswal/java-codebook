/*
 * https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1209/
 */

package linked_list;

import java.util.Stack;
import linked_list.MyLinkedList.Node;

class LinkedListPalindrome {

	/**
	 * Given the head of a singly linked list, return true if it is a palindrome.
	 */
	public static boolean isPalindrome(Node head) {

		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		Node head1 = reverse(slow);
		slow.next = null;
		Node curr = head;
		while (curr != null && head1 != null) {
			if (curr.val != head1.val)
				return false;
			curr = curr.next;
			head1 = head1.next;
		}
		return true;

	}

	public static Node reverse(Node head) {

		Node prev = null;
		Node curr = head;
		Node forward = head;
		while (curr != null) {
			forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		return prev;
	}

	public static boolean isPalindrome_approach(Node head) {

		Stack<Integer> st = new Stack();
		Node curr = head;
		while (curr != null) {
			st.push(curr.val);
			curr = curr.next;
		}

		while (!st.isEmpty()) {
			if (st.pop() != head.val)
				return false;
			head = head.next;
		}
		if (head == null)
			return true;
		else
			return false;
	}

}
