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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> level = new ArrayList<>();
        if(root == null) return level;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (q.size() > 0) {
            int c = q.size();
            List<Integer> l = new ArrayList<>();
            while(c>0) {
                TreeNode n = q.poll();
                l.add(n.val);
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
                c--;
            }
            level.add(l);
        }
        return level;
    }
}
