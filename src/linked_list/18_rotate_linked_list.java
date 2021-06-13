/*
 * https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1295/
 */

package linked_list;

import linked_list.MyLinkedList;
import linked_list.MyLinkedList.Node;

class LinkedListRotate {

	/**
	 * Given the head of a linked list, rotate the list to the right by k places.
	 */
	public static Node rotateRight(Node A, int B) {
		/*
		 * [1,2,3,4,5] 2 = [4,5,1,2,3]
		 */

		if (B == 0 || A == null)
			return A;
		Node curr = A;
		int n = 0;
		while (curr != null) {
			++n;
			curr = curr.next;
		}
		if (B >= n) {
			B = B % n;
		}
		if (B == 0)
			return A;
		Node temp = A;
		for (int i = 1; i < n - B; i++) {
			if (temp.next == null)
				return A;
			temp = temp.next;
		}
		Node slow = temp;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = A;
		A = slow.next;
		slow.next = null;

		return A;

	}

	public static Node rotateLeft(Node A, int B) {
		/*
		 * [1,2,3,4,5] 2 = [3,4,5,1,2]
		 */

		if (B == 0 || A == null)
			return A;
		Node temp = A;
		for (int i = 1; i < B; i++) {
			if (temp.next == null)
				return A;
			temp = temp.next;
		}
		Node slow = temp;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = A;
		A = slow.next;
		slow.next = null;
		return A;

	}
}
