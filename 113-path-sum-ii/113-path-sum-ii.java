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

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        
        helper(root, new ArrayList<>(), result, targetSum);
        return result;
    }
    
    public void helper(TreeNode root, List<Integer> curr, List<List<Integer>> result, int targetSum){
        if(root == null) return;

        curr.add(root.val);
        if(targetSum-root.val == 0 && root.left==null && root.right==null){
            result.add(new ArrayList<Integer>(curr));
        }
        
        helper(root.left, curr, result, targetSum-root.val);
        helper(root.right, curr, result, targetSum-root.val);
       curr.remove(curr.size()-1);

        // for(int i=0; i<curr.size(); i++){
        //     if(curr.get(i)==root.val) curr.remove(i);
        // }
        
    }
}