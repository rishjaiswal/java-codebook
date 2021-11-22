/*
 * https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1681/
 *
 * Given a linked list, swap every two adjacent nodes and return its head.
 * You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 */

package recursion;

class SwapNode {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode post = swapPairs(head.next.next);
        // 1 -> 2
        //res = 2
        ListNode res = head.next;
        // 2-> 1
        res.next = head;
        // 1-> null
        head.next = post;
        // return new head i.e. 2
        return res;

    }
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}