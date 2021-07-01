/*
 * Stack - Dynamic Array Based Implementation
 */

package stack;

class stackImplementArrayDynamic {
	/*
	 * This implementation of stack ADT uses an dynamic array. In the array, we add
	 * elements from left to right and use a variable to keep track of the index of
	 * the top element.
	 * 
	 * If the array is full, create a new array of twice the size, and copy the
	 * items. With this approach, pushing n items takes time proportional to n (not n2).
	 */

	public int capacity;
	int[] stackImp;
	int top = -1;

	stackImplementArrayDynamic(int cap) {
		capacity = cap;
		stackImp = new int[capacity];
	}

	public void push(int i) {
		if (top == capacity - 1) {
			expand();
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
	
	/*
	For n push operations we double the array size logn times.
	That means, we will have logn terms in the expression below. 
	The total time T(n) of a series of n push operations is proportional to
	T(n) is O(n) and the amortized time of a push operation is O(1) .
	*/
	public void expand() {
		int length = size();
		int[] newstack = new int[length<<1];
		System.arraycopy(stackImp, 0, newstack,0, length);
		stackImp = newstack;
		capacity = capacity << 1;
	}

}

/*
 * 
 * Performance: Let n be the number of elements in the stack. The complexities
 * of stack operations with this representation can be given as:
 * 
 * Space Complexity (for n push operations) O(n) 
 * Time Complexity of create Stack: DynamicArrayStack () O(1)
 * Time Complexity of push() O(1)
 * Time Complexity of pop() O(1) 
 * Time Complexity of size() O(1) 
 * Time Complexity of isEmpty() O(1)
 * 
Note: Too many doublings may cause memory overflow exception.
 */