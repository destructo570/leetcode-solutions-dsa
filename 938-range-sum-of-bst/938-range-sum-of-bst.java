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
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        return iterative(root, low, high);
    }
    
    public int recursive(TreeNode root, int low, int high) {
        if(root==null) return 0;
        if(root.val < low) return rangeSumBST(root.right, low, high);
        if(root.val > high) return rangeSumBST(root.left, low, high);
        return root.val + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);
    }
    
    public int iterative(TreeNode root, int low, int high) {
        int sum=0;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            if(root==null) continue;
            if(root.val >= low && root.val<=high) sum+=root.val;
            if(root.val > low) st.push(root.left);
            if(root.val < high) st.push(root.right);
        }
        
        return sum;
    }
}