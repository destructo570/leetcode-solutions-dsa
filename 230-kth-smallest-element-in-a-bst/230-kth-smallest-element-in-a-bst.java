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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        
        if(root==null) return -1;
        
        Stack<TreeNode> stack = new Stack<>();
        
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            
            root=stack.pop();
            result.add(root.val);
            root=root.right;
        }
        
        return result.get(k-1);
    }
    
    public void inOrderTraversal(TreeNode root, List<Integer> result) {
        if(root==null) return;
        
        inOrderTraversal(root.left, result);
        result.add(root.val);
        inOrderTraversal(root.right, result);
    }
    
// ============  Using Recursion
//     public int kthSmallest(TreeNode root, int k) {
//         List<Integer> result = new ArrayList<>();
//         inOrderTraversal(root, result);
//         return result.get(k-1);
//     }
    
//     public void inOrderTraversal(TreeNode root, List<Integer> result) {
//         if(root==null) return;
        
//         inOrderTraversal(root.left, result);
//         result.add(root.val);
//         inOrderTraversal(root.right, result);
//     }
}