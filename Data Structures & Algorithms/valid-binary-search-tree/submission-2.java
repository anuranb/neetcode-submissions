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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return travelBST(Integer.MIN_VALUE, root,  Integer.MAX_VALUE);
        // boolean left=false, right=false;
        // if(root.left == null) left=true;
        // else if(root.left.val < root.val) left = isValidBST(root.left);

        // if(root.right==null) right=true;
        // else if(root.right.val > root.val) right = isValidBST(root.right);
        
        // System.out.println(left+", "+right);
        // return left && right;
    }

    public boolean travelBST(int min, TreeNode node, int max) {
        if(node == null) return true;
        int val = node.val;
        if(min<val && val<max) {
            return travelBST(min, node.left, val) && travelBST(val, node.right, max);
        }
        return false;
    }
}
