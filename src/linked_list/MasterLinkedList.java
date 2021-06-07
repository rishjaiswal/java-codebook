package linked_list;

import linked_list.MyLinkedList;
import linked_list.LinkedListCycle;
import linked_list.LinkedListCycleNode;
import linked_list.LinkedListRemove;
import linked_list.LinkedListIntersection;
import linked_list.LinkedListReverse;
import linked_list.LinkedListRemoveElements;

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
		System.out.println("Cycle is present in Linked List : " + LinkedListCycle.hasCycle(obj.head));
		System.out.println("Cycle is present in Linked List : " + LinkedListCycle.hasCycleApproach(obj.head));
		System.out.println("Cycle is present in Linked List using Second Approach : " + LinkedListCycle.hasCycleSecondApproach(obj.head));
		System.out.println("Cycle Node in Linked List is : " + LinkedListCycleNode.detectCycleNode(obj.head));
		System.out.println("Head of First Linked List is " + obj.head + " and value is " + obj.head.val);
		// Linked list 2
		MyLinkedList obj_second = new MyLinkedList();
		obj_second.addAtHead(4);
		obj_second.addAtTail(6);
		obj_second.addAtIndex(1, 5);
		obj_second.addAtTail(7);
		obj_second.printLinkedList();
		System.out.println("Head of Second Linked List is " + obj_second.head + " and value is " + obj_second.head.val);
		System.out.println("Intersection Node in Linked List First and Second is is : "
				+ LinkedListIntersection.getIntersectionNode(obj.head, obj_second.head));
		System.out.println("First Linked List before deletion ");
		obj.printLinkedList();
		System.out.println("Head of First Linked List after deletion index 1 from last end ");
		obj.head = LinkedListRemove.removeNthFromEnd(obj.head, 1);
		System.out.println("First Linked List after deletion ");
		obj.printLinkedList();
		System.out.println("Second Linked List before deletion ");
		obj_second.printLinkedList();
		System.out.println("Head of First Linked List after deletion index 2 from last end ");
		obj_second.head = LinkedListRemove.removeNthFromEnd(obj_second.head, 2);
		System.out.println("Second Linked List after deletion ");
		obj_second.printLinkedList();
		obj_second.head = LinkedListReverse.reverseList(obj_second.head);
		System.out.println("Second Linked List Head after Reverse");
		obj_second.printLinkedList();
		obj_second.addAtHead(5);
		System.out.println("Second Linked List before deletion ");
		obj_second.printLinkedList();
		obj_second.head = LinkedListRemoveElements.removeElements(obj_second.head, 5);
		System.out.println("Second Linked List after deletion ");
		obj_second.printLinkedList();

	}

}