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
        if(root==null) return 0;
        if(root.val < low) return rangeSumBST(root.right, low, high);
        if(root.val > high) return rangeSumBST(root.left, low, high);
        return root.val + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);
    }
    
    public int iterative(TreeNode root, int low, int high) {
        int sum=0;
        Stack<TreeNode> st = new Stack<TreeNode>();
        while(!st.isEmpty() || root!=null){
            while(root!=null){
                st.push(root);
                root=root.left;
            }
            
            root=st.pop();
            if((root.val >= low && root.val<=high)) sum+=root.val;
            root=root.right;
        }
        
        return sum;
    }
}