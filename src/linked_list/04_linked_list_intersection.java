/*
 * https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1215/
 */

package linked_list;

import linked_list.MyLinkedList.Node;

class LinkedListIntersection {

	/**
	 * Given the heads of two singly linked-lists headA and headB, return the node
	 * at which the two lists intersect. If the two linked lists have no
	 * intersection at all, return null.
	 * 
	 */
	public static Node getIntersectionNode(Node headA, Node headB) {

		int length_A = getLength(headA);
		int length_B = getLength(headB);
		int diff = 0;

		if (length_A > length_B) {
			diff = length_A - length_B;
			headA = moveNode(headA, diff);
		} else {
			diff = length_B - length_A;
			headB = moveNode(headB, diff);
		}
		while (headA != null && headB != null) {
			if (headA == headB)
				return headA;
			headA = headA.next;
			headB = headB.next;
		}
		return null;

	}

	public static int getLength(Node head) {
		Node curr = head;
		int length = 0;
		while (curr != null) {
			length++;
			curr = curr.next;
		}
		return length;
	}

	public static Node moveNode(Node head, int index) {
		for (int i = 0; i < index; i++) {
			head = head.next;
		}
		return head;
	}

}
