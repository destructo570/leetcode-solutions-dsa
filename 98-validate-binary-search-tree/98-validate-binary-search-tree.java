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
        //return checkValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            
            root = stack.pop();
            if(prev!=null && root.val<=prev.val) return false;
            prev=root;
            root=root.right;
        }
        return true;
    }
    
    public boolean checkValid(TreeNode root, long min, long max) {
        if(root==null) return true;
        
        if(root.val<min || root.val>max) return false;
        
        return checkValid(root.left, min, root.val-1L) && checkValid(root.right, root.val+1L, max);

    }
}