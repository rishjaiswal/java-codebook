/*
 * https://leetcode.com/explore/learn/card/linked-list/210/doubly-linked-list/1294/
 */

package linked_list;

import linked_list.MyLinkedList.Node;

class DoublyLinkedList {

	Node head;
	int length;

	class Node {
		int val;
		Node next;
		Node prev;

		Node(int x) {
			val = x;
			next = null;
			prev = null;
		}
	}

	/** Initialize your data structure here. */
	public DoublyLinkedList() {
		head = null;
		length = 0;
	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {

		if (index < 0 || index >= length) {
			return -1;
		}
		Node curr = head;
		for (int i = 0; i < index; i++) {
			curr = curr.next;
		}
		return curr.val;
	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {

		Node data = new Node(val);
		data.next = head;
		if (head != null)
			head.prev = data;
		head = data;
		length = length + 1;
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {

		if (length == 0) {
			addAtHead(val);
			return;
		}
		Node data = new Node(val);
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = data;
		data.prev = curr;
		length = length + 1;

	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {

		Node data = new Node(val);

		if (index > this.length) {
			return;
		}
		if (index == 0) {
			addAtHead(val);
			return;
		}
		if (index == length) {
			addAtTail(val);
			return;
		}
		Node curr = head;
		for (int i = 0; i < index - 1; i++) {
			curr = curr.next;
		}
		data.next = curr.next;
		curr.next = data;
		data.prev = curr;
		length = length + 1;
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {

		if (index < 0 || index >= length) {
			return;
		}

		if (index == 0) {
			head = head.next;
			if (head != null)
				head.prev = null;
			length = length - 1;
			return;
		}

		Node curr = head;
		for (int i = 0; i < index; i++) {
			curr = curr.next;
		}
        curr.prev.next= curr.next;
        // Change next only if node to be deleted
        // is NOT the last node
        if(curr.next !=null)
            curr.next.prev = curr.prev;
		length = length - 1;
	}

	/** Print the all nodes values in the Linked List */
	public void printDoublyLinkedList() {
		Node curr = head;
		System.out.println("Doubly Linked List is :  ");
		while (curr != null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println("");
	}
}
