/*
 * https://leetcode.com/explore/learn/card/linked-list/209/singly-linked-list/1290/
 */

package linked_list;

class MyLinkedList {

	Node head;
	int length;

	class Node {
		int val;
		Node next;

		Node(int x) {
			val = x;
			next = null;
		}
	}

	/** Initialize your data structure here. */
	public MyLinkedList() {
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

		System.out.println("Addition at head having value " + val);
		Node data = new Node(val);
		data.next = head;
		head = data;
		length = length + 1;
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {

		System.out.println("Addition at tail having value " + val);
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
		length = length + 1;

	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {

		System.out.println("Addition at index " + index + " having value " + val);
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
		/*
		 * 1 -> 3 Insert(1,2) 1->2->3
		 * 
		 * 2->3 1->2
		 */
		Node curr = head;
		for (int i = 0; i < index - 1; i++) {
			curr = curr.next;
		}
		data.next = curr.next;
		curr.next = data;
		length = length + 1;

	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {

		System.out.println("Deletion at index " + index);
		if (index < 0 || index >= length) {
			return;
		}

		if (index == 0) {
			head = head.next;
			length = length - 1;
			return;
		}

		Node curr = head;
		Node prev = head;
		for (int i = 0; i < index; i++) {
			prev = curr;
			curr = curr.next;
		}
		prev.next = curr.next;
		length = length - 1;
	}

	/** Print the all nodes values in the Linked List */
	public void printLinkedList() {
		Node curr = head;
		System.out.println("Linked List is :  ");
		for (int i = 0; i < length; i++) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println("");
	}
}
