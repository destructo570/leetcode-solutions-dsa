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
    
    
    public int traverse(TreeNode root, int low, int high, int sum) {
        if(root==null) return 0;
        
        if((root.val >= low && root.val<=high)) return sum+=root.val;
        
        
        return traverse(root.left, low, high, sum)+traverse(root.right, low, high, sum);
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