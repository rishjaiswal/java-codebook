/*
 * https://leetcode.com/explore/learn/card/recursion-i/251/scenario-i-recurrence-relation/2378/
 *
 */

package recursion;

class ReverseLL {
    public static ListNode reverse(ListNode head){
     // Base case
     if(head== null || head.next == null)
         return head;
     // Recurrence Relation
     ListNode new_node = reverse(head.next);

     // change references for middle chain
     head.next.next = head;
     head.next = null;

     // send back new head node in every recursion
     return new_node;
    }
}

/**

 Dry-Run : [1,2,3]

 reverse(1)
 new_node = reverse(2);
 new_node = reverse(3);
 new_node = reverse(null);

 1. new_node = reverse(null);
 >> return null;

 2. new_node = reverse(3);
 >> return 3;

 3.  new_node = reverse(2);
>> 3 -> 2
 >> 2 -> null

 4. reverse(1);
 >> 2 -> 1
 >> 1 -> null

 return 3 -> 2 -> 1 ;
 */