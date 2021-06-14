/*
 * https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/
 * https://leetcode.com/problems/remove-duplicates-from-an-unsorted-linked-list/
 */

package linked_list;

import linked_list.MyLinkedList.Node;
import java.util.HashSet;

class LinkedListRemoveDuplicatesUnsorted {

	/**
	 * Write a removeDuplicates() function that takes a list and deletes any
	 * duplicate nodes from the list. The list is not sorted. For example if the
	 * linked list is 12->11->12->21->41->43->21 then removeDuplicates() should
	 * convert the list to 12->11->21->41->43. .
	 * 
	 */
	public static Node deleteDuplicatesUnsorted(Node head) {
		/*
		 * We traverse the link list from head to end. For every newly encountered
		 * element, we check whether it is in the hash table: if yes, we remove it;
		 * otherwise we put it in the hash table.
		 */
		if (head == null)
			return null;
		// Hash to store seen values
		HashSet<Integer> hs = new HashSet<>();

		/* Pick elements one by one */
		Node current = head;
		Node prev = null;
		while (current != null) {
			int curval = current.val;

			// If current value is seen before
			if (hs.contains(curval)) {
				prev.next = current.next;
			} else {
				hs.add(curval);
				prev = current;
			}
			current = current.next;
		}
		return head;
	}

	/*
	 * Another Approach - METHOD 2 (Use Sorting) In general, Merge Sort is the
	 * best-suited sorting algorithm for sorting linked lists efficiently. 1) Sort
	 * the elements using Merge Sort. We will soon be writing a post about sorting a
	 * linked list. O(nLogn) 2) Remove duplicates in linear time using the algorithm
	 * for removing duplicates in sorted Linked List. O(n) Please note that this
	 * method doesn’t preserve the original order of elements. Time Complexity:
	 * O(nLogn)
	 */
}
