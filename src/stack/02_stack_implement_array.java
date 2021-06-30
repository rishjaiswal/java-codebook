/*
 * Stack - Array Based Implementation
 */

package stack;

class stackImplementArray {
	/*
	 * This implementation of stack ADT uses an array. In the array, we add elements
	 * from left to right and use a variable to keep track of the index of the top
	 * element.
	 * 
	 * The array storing the stack elements may become full. A push operation will
	 * then throw a full stack exception. Similarly, if we try deleting an element
	 * from an empty stack it will throw stack empty exception.
	 */

	public int capacity;
	int[] stackImp;
	int top = -1;

	stackImplementArray(int cap) {
		capacity = cap;
		stackImp = new int[capacity];
	}

	public void push(int i) {
		if (top == capacity - 1) {
			System.out.println("Stack Overflow since Capacity Length Exceeds");
			return;
		}
		stackImp[++top] = i;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Pop Element is NA since stack is empty ");
			return -1;
		}
		int data = stackImp[top];
		stackImp[top--] = Integer.MIN_VALUE;
		return data;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Peek Element is NA since stack is empty ");
			return -1;
		}
		return stackImp[top];
	}

	public boolean isEmpty() {
		if (top == -1) {
			System.out.println("Stack is Empty since Capacity Length is 0 ");
			return true;
		}
		return false;
	}

	public int size() {
		return top + 1;
	}
}

/*
 * 
 * Performance: Let n be the number of elements in the stack. The complexities
 * of stack operations with this representation can be given as:
 * 
 * Space Complexity (for n push operations) O(n) 
 * Time Complexity of push() O(1)
 * Time Complexity of pop() O(1) 
 * Time Complexity of size() O(1) 
 * Time Complexity of isEmpty() O(1)
 * 
 * 
 * Limitations: The maximum size of the stack must first be defined and it
 * cannot be changed. Trying to push a new element into a full stack causes an
 * implementation-specific exception.
 * 
 */