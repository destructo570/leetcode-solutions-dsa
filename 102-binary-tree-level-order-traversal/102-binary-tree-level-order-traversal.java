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
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<=height(root); i++){
            result.add(getNodesAtKDistance(root,i));
        }
        return result;
    }
    
    public int height(TreeNode root){
        if(root==null) return -1;
        
        if(root.left==null && root.right==null) return 0;
        
        return 1+Math.max(height(root.left), height(root.right));
    }
    
    public List<Integer> getNodesAtKDistance(TreeNode root, int distance) {
        List<Integer> result = new ArrayList<>();
        getNodesAtKDistance(root, distance, result);
        return result;
    }

    private void getNodesAtKDistance(TreeNode root, int distance, List<Integer>     result){
        if(root==null) return;
        if(distance==0){
            result.add(root.val);
            return ;
        }
        getNodesAtKDistance(root.left, distance-1, result);
        getNodesAtKDistance(root.right, distance-1, result);
    }
}