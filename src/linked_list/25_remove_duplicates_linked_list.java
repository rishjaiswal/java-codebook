/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 */

package linked_list;

import linked_list.MyLinkedList.Node;
import linked_list.MyLinkedList;

class LinkedListRemoveDuplicates {

	/**
	 * Given the head of a sorted linked list, delete all duplicates such that each
	 * element appears only once. Return the linked list sorted as well.
	 * 
	 */
	public static Node deleteDuplicates(Node head) {
		if (head == null)
			return null;
		Node curr = head;
		while (curr != null && curr.next != null) {
			if (curr.next.val == curr.val) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
		return head;
	}
	
	/**
	 * Given the head of a sorted linked list, delete all nodes that have duplicate
	 * numbers, leaving only distinct numbers from the original list. Return the
	 * linked list sorted as well.
	 * 
	 */
	public static Node deleteDuplicatesAll(Node head) {
		if (head == null)
			return null;
		MyLinkedList obj = new MyLinkedList();
		obj.addAtHead(-1);
		Node sentinel = obj.head;
        sentinel.next = head;
        // predecessor = the last node 
        // before the sublist of duplicates
        Node pred = sentinel;
        
        while (head != null) {
            // if it's a beginning of duplicates sublist 
            // skip all duplicates
            if (head.next != null && head.val == head.next.val) {
                // move till the end of duplicates sublist
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;    
                }
                // skip all duplicates
                pred.next = head.next;     
            // otherwise, move predecessor
            } else {
                pred = pred.next;    
            }
                
            // move forward
            head = head.next;    
        }  
        return sentinel.next;
    }
}
