/*
 * https://leetcode.com/explore/learn/card/recursion-i/256/complexity-analysis/2375/
 */


package recursion;

class MaximumDepth {
    public static int maxDepth(TreeNode root) {
        int count  = 0 ;
        // Helper Utility to keep count
        return helper(root,count);
    }

    public static int helper(TreeNode root, int count){
        if(root == null)
            return count;
        return Math.max(helper(root.left, count+1), helper(root.right, count+1));
    }


    public static int max(TreeNode root) {
        // Base case
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(max(root.left), max(root.right));
    }

    /**
     * maxDepth has to traverse the entire tree, since it doesn't know if a certain path can lead to a max Depth
     * until it reaches the leaf that ends that path.
     * Therefore the time complexity is O(n).
     *
     *  NOTE : The leftmost parameter to the function is entirely evaluated first, then the right one.
     *  Hence , the algorithm will go through every node exactly once.
     *
     *
     *  Space complexity is O(n), the space cost incurred on the stack size because of recursion calls.
     */
}