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
    Map<Integer,Integer> inorderMap = new HashMap<>();
    int preId = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0; i<inorder.length; i++) inorderMap.put(inorder[i],i);

        return dfs(0, preorder, inorder.length-1);
    }

    public TreeNode dfs(int left, int[] preorder, int right) {
        if(left>right) return null;
        int rootVal = preorder[preId++];
        TreeNode curr = new TreeNode(rootVal);
        curr.left = dfs(left, preorder, inorderMap.get(rootVal).intValue()-1);
        curr.right = dfs(inorderMap.get(rootVal).intValue()+1, preorder, right);
        return curr;
    }
}
