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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        return traverse(root, result);
    }
    
    public List<Integer> traverse(TreeNode root, ArrayList<Integer> res) {
        
        if(root == null) return res;
        traverse(root.left, res);
        res.add(root.val);
        traverse(root.right, res);
        return res;
    }
}