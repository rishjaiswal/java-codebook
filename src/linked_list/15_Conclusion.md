# Conculsion - Linked List.

Here is the review of the performance of the singly linked list and doubly linked list.

They are similar in many operations:

- Both of them are not able to access the data at a random position in constant time.
- Both of them are able to add a new node after given node or at the beginning of the list in O(1) time.
- Both of them are able to delete the first node in O(1) time.
But it is a little different to delete a given node (including the last node).

In a singly linked list, it is not able to get the previous node of a given node so we have to 
spend O(N) time to find out the previous node before deleting the given node.
In a doubly linked list, it will be much easier because we can get the previous node with the "prev" 
reference field. So we can delete a given node in O(1) time.


Here we provide a comparison of time complexity between the linked list and the array.

<img src="https://assets.leetcode.com/uploads/2020/10/02/comparison_of_time_complexity.png" alt="ConclusionLinkedList" height="280" style="vertical-align:top; margin:4px">


After this comparison, it is not difficult to come up with our conclusion:

- If you need to add or delete a node frequently, a linked list could be a good choice.
- If you need to access an element by index often, an array might be a better choice than a linked list