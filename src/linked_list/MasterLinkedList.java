package linked_list;

import linked_list.*;

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
		System.out.println("Cycle is present in Linked List using Second Approach : "
				+ LinkedListCycle.hasCycleSecondApproach(obj.head));
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
		obj_second.addAtHead(9);
		obj_second.printLinkedList();
		obj_second.head = LinkedListPartition.partition(obj_second.head, 5);
		System.out.println("Second Linked List after Parition by Node value 5 ");
		obj_second.printLinkedList();
		obj_second.head = LinkedListNumber.oddEven(obj_second.head);
		System.out.println("Second Linked List after Parition by Even Odd Node Values ");
		obj_second.printLinkedList();
		obj_second.addAtTail(8);
		obj_second.printLinkedList();
		obj_second.head = LinkedListLinks.oddEvenLinks(obj_second.head);
		System.out.println("Second Linked List after Parition by Even Odd Node Links ");
		obj_second.printLinkedList();
		System.out
				.println("Linked List is palindrome : " + LinkedListPalindrome.isPalindrome_approach(obj_second.head));
		obj_second.printLinkedList();
		obj_second.head = LinkedListMiddle.middleNode(obj_second.head);
		System.out.println("Second Linked List after from Middle Node ");
		obj_second.printLinkedList();
		// Design Doubly LinkedList
		DoublyLinkedList obj_doubly = new DoublyLinkedList();
		System.out.println("Index at linkedList index is " + obj_doubly.get(1));
		obj_doubly.addAtHead(1);
		obj_doubly.addAtTail(3);
		obj_doubly.addAtIndex(1, 2);
		obj_doubly.printDoublyLinkedList();
		System.out.println("Before Merging Linked Lists :");
		obj.printLinkedList();
		obj_second.printLinkedList();
		obj.head = LinkedListMerge.mergeTwoLists(obj.head, obj_second.head);
		System.out.println("After Merging Linked Lists :");
		obj.printLinkedList();
		System.out.println("Before Adding Linked Lists :");
		obj.printLinkedList();
		obj_second.printLinkedList();
		System.out.println("After Adding Linked Lists :");
		obj.head = LinkedListAdd.addTwoNumbers(obj.head, obj_second.head);
		obj.printLinkedList();
		obj.head = LinkedListRotate.rotateRight(obj.head, 1);
		obj.printLinkedList();
	}
}