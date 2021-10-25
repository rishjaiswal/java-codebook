/*
https://leetcode.com/explore/learn/card/queue-stack/232/practical-application-stack/1383/
*/

package stack;

import java.util.*;

class MyTreeNode {
    int data;
    MyTreeNode left;
    MyTreeNode right;

    public MyTreeNode(int d) {
        data = d;
        left = null;
        right = null;
    }
}

class InorderTreeUsingStack {
    public List<Integer> inorderTraversal(MyTreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<MyTreeNode> stack = new Stack<>();
        MyTreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.data);
            curr = curr.right;
        }
        return res;
    }
}