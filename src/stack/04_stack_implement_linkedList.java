/*
 * Stack - LinkedList Based Implementation
 */

package stack;


class LinkedListNode {
	int data;
	LinkedListNode next;
	LinkedListNode(int d){
		data=d;
		next=null;
	}
}


class stackImplementLinkedList {
	/*
	 * This implementation of stack ADT uses an Linked lists. 
	 * Push operation is implemented by inserting element at the beginning of the list. 
	 * Pop operation is implemented by deleting the node from the beginning (the header/top node).
	 */
	
	LinkedListNode top;
	int length;
	
	stackImplementLinkedList() {
		top=null;
		length=0;
	}

	public void push(int i) {
		if(top==null) {
			top = new LinkedListNode(i);
			length++;
			return;
		}
		LinkedListNode temp= new LinkedListNode(i) ;
		temp.next = top;
		top = temp;
		length++;
	}

	public int pop() {
		if(isEmpty()) {
			System.out.println("Pop Element is NA since stack is empty ");
			return -1;
		}
		int result = top.data;
		top= top.next;
		length--;
		return result;
	}

	public int peek() {
		if(isEmpty()) {
			System.out.println("Peek Element is NA since stack is empty ");
			return -1;
		}
		return top.data;
	}

	public boolean isEmpty() {
		return (top==null);
	}

	public int size() {
		return length;
	}
	
}

/*
 * 
 * Performance: Let n be the number of elements in the stack. The complexities
 * of stack operations with this representation can be given as:
 * 
 * Space Complexity (for n push operations) : O(n)
 * Time Complexity of create Stack: O(1)
 * Time Complexity of push(): O(1)
 * Time Complexity of pop() : O(1)
 * Time Complexity of size() : O(1)
 * Time Complexity of isEmpty() : O(1)
 * 
*/