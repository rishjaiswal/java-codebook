package linked_list;

import linked_list.MyLinkedList;
import linked_list.LinkedListCycle;
import linked_list.LinkedListCycleNode;

public class MasterLinkedList {

	public static void main(String args[]) {
		System.out.println("Start execution of the LinkedList programs");
		MyLinkedList obj = new MyLinkedList();
		// Design LinkedList
		int param = obj.get(1);
		System.out.println("Index at linkedList index is " + param);
		obj.addAtHead(1);
		obj.addAtTail(3);
		obj.addAtIndex(1, 2);
		param = obj.get(0);
		System.out.println("Index at linkedList index is " + param);
		param = obj.get(1);
		System.out.println("Index at linkedList index is " + param);
		param = obj.get(2);
		System.out.println("Index at linkedList index is " + param);
		param = obj.get(1);
		obj.printLinkedList();
		System.out.println("Index at linkedList index before deletion is " + param);
		obj.deleteAtIndex(1);
		param = obj.get(1);
		System.out.println("Index at linkedList index after deletion is " + param);
		obj.printLinkedList();
		System.out.println("Cycle is present in Linked List : "+ LinkedListCycle.hasCycle(obj.head));
		System.out.println("Cycle Node in Linked List is : "+ LinkedListCycleNode.detectCycleNode(obj.head));

	}

}