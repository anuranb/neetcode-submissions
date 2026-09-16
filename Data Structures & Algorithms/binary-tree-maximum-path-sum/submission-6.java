/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int r = maxSum(root);
        return max>r?max:r;
    }

    public int maxSum(TreeNode root) {
        if(root==null) return 0;

       
        int leftSum = maxSum(root.left);
        int rightSum = maxSum(root.right);

        int pathSum = leftSum + root.val + rightSum;
        if (pathSum > max) max = pathSum;
        if (root.val > max) max = root.val;
        if (root.val + leftSum > max) max = root.val + leftSum;
        if (root.val + rightSum > max) max = root.val + rightSum;

        return Math.max(root.val, root.val + (leftSum>rightSum ? leftSum : rightSum));
    }
}
