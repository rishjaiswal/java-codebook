/*
 * https://leetcode.com/problems/sort-list/
 */

package linked_list;

import linked_list.MyLinkedList.Node;
import linked_list.LinkedListMerge;

class LinkedListSort {

	/**
	 * Given the head of a linked list, return the list after sorting it in
	 * ascending order.
	 * 
	 */
	public static Node sortList(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node mid = getMiddleNode(head);
		Node left = sortList(head);
		Node right = sortList(mid);
		return LinkedListMerge.mergeTwoLists(left,right);
	}
	
	public static Node getMiddleNode(Node head) {
		// [1,2,3,4] : [1,2] [3,4]
		// [1,2,3] : [1] [2,3]
        Node midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
	}
}
