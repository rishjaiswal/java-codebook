/*
 * https://leetcode.com/explore/learn/card/recursion-i/251/scenario-i-recurrence-relation/3233/
 */

package recursion;

class BSTSearch {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return root;
        if(root.val == val)
            return root;
        if(root.val > val)
            return searchBST(root.left,val);
        return searchBST(root.right,val);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
