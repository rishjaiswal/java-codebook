# Master Repository for DataStructure and Coding Questions

## Array

- Array stores a fixed-size sequential collection of elements of the same type. An array is used to store a collection of data
- JDK 1.5 introduced a new for loop known as foreach loop or enhanced for loop, which enables you to traverse the complete array sequentially without using an index variable.

## Tree

- Tree data structure comprises of nodes connected in a particular arrangement and they (particularly binary trees) make search operations on the data items easy. 
- The tree data structures consists of a root node which is further divided into various child nodes and so on. The number of levels of the tree is also called height of the tree.

## Stack

- The stack follows a “LIFO” technique for storing and retrieving elements. 
- The element which is stored at the end will be the first one to be retrieved from the stack. 
- The stack has the following primary functions:
Push(): To insert an element in the stack.
Pop(): To remove an element from the stack.

## Queue

- The queue follows a “FIFO” technique for storing and retrieving elements.
- It is an ordered list of objects with its use limited to insert elements at the end of the list and deleting elements from the start of the list.
- The queue has the following primary functions :
  add() : To add an element in queue
  remove() : To remove an element from queue


## Recursion

- The process in which a function calls itself directly or indirectly is called recursion and the corresponding function is called as recursive function

## LinkedList

- A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. 
- The elements in a linked list are linked using pointers

## String 

- The String class represents character strings. All string literals in Java programs, such as "abc", are implemented as instances of this class.
- Strings are constant; their values cannot be changed after they are created. String buffers support mutable strings. Because String objects are immutable they can be shared.

## BackTracking

- Backtracking is an algorithmic-technique for solving problems recursively by trying to build a solution incrementally, one piece at a time, removing those solutions that fail to satisfy the constraints of the problem at any point of time 

## Dynamic Programming.

- A Dynamic programming a method for solving a complex problem by breaking it down into a collection of simpler subproblems, solving each of those subproblems just once, and storing their solutions.


## How to approach a programming question
1. Understand the problem
2. Ask clarifying questions
3. Discuss solution before attempting
4. Design test cases
5. Develop Solution

### Example:
Write a program to remove a character from String
- Input: String = abcd, Char = a
- Output: bcd

### Clarifying questions:
1. What could be the maximum length of input String?
2. Are we considering special characters as well?
3. What outcome do we expect if string/char is empty or null?
4. If String is  "java". Should we remove all the a's or just first occurrence?
5. Should we consider case sensitivity?
6. What arguments should be passed to method and what is expected return type? 

### Test Cases

Build Method signature to design test cases
```
String removeCharacter(String str, char c){
        // logic
}
```

```
- removeCharFromString("google",'l') - Happy Path
- removeCharFromString("googLe", 'l') - Case Sensitive
- removeCharFromString("google", 'b') - Negative case
- removeCharFromString("", ' ') - Empty & Space
- removeCharFromString(null, ' ') - Null & Space
- removeCharFromString("g", 'g') - Corner Case
- removeCharFromString("google",'o') - Consecutive chars
- removeCharFromString(123, 'g') - Compile Time Error
```

### Solution

- Implement solution and mention time and space complexity of the program