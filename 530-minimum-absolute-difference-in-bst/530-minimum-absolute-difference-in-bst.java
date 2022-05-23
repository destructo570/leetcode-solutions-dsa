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
    public int getMinimumDifference(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        int min = Integer.MAX_VALUE;
        if(root==null) return 0;
        TreeNode prev=null;
        while(!st.isEmpty() || root!=null){
            while(root!=null){
                st.push(root);
                root=root.left;
            }
            
            TreeNode popped = st.pop();
            
            if(prev!=null) min=Math.min(min, popped.val-prev.val);
            
            root=popped.right;
            prev=popped;
        }
        return min;
    }
}