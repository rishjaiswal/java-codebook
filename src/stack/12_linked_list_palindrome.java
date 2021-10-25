/*
https://leetcode.com/problems/palindrome-linked-list/
*/

package stack;

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class LinkedListPalindrome {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack();
        ListNode curr = head;
        while (curr != null) {
            st.push(curr.val);
            curr = curr.next;
        }

        while (!st.isEmpty()) {
            if (st.pop() != head.val)
                return false;
            head = head.next;
        }
        return true;
    }
}