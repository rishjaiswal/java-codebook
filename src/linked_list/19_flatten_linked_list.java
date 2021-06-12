/*
 * https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1225/
 */

package linked_list;

import java.util.Stack;
import linked_list.MyLinkedList.Node;

class LinkedListFlatten {

	/**
	 * You are given a doubly linked list which in addition to the next and previous
	 * pointers, it could have a child pointer, which may or may not point to a
	 * separate doubly linked list. These child lists may have one or more children
	 * of their own, and so on, to produce a multilevel data structure.
	 * 
	 * Flatten the list so that all the nodes appear in a single-level, doubly
	 * linked list. You are given the head of the first level of the list.
	 */
	public static Node flatten(Node head) {
		 Stack<Node> q = new Stack<>();
	        Node res = head;
	        while(head != null){
	            if(head.child != null){
	                if(head.next != null)
	                	// Stack push Head Next if Node is having child.
	                    q.push(head.next);
	                head.next = head.child;
	                head.child.prev = head;
	                head.child = null;
	            }
	            // At the End of Chidren We pull from the Head next iteration
	            if(head.next == null && !q.isEmpty()){
	                Node temp = q.pop();
	                head.next = temp;
	                temp.prev = head;
	            }
	            head = head.next;
	        }
	        return res;

	}
}
