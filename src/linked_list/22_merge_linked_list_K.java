/*
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */

package linked_list;

import linked_list.MyLinkedList;
import linked_list.MyLinkedList.Node;
import linked_list.LinkedListMerge;

class LinkedListMergeK {

	/**
	 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
	 * Merge all the linked-lists into one sorted linked-list and return it.
	 */
	public static Node mergeKLists(Node[] lists) {
		//Base Condition
        if (lists.length ==0)
            return null;
        
		 int last = lists.length-1;
	        while(last !=0)
	        {
	            int i = 0, j = last;  
	            while(i<j)
	            {
	                // merge List i with List j and store  
	                // merged list in List i  
	                lists[i] = LinkedListMerge.mergeTwoLists(lists[i],lists[j]);

	                // consider next pair  
	                i++;
	                j--;

	                // If all pairs are merged, update last  
	                if (i >= j)  
	                    last = j;  

	             }
	        }
	        return lists[0];
	    }
}
