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
        helper(root, new LinkedList<>(), result, targetSum);
        return result;
    }
    
    public void helper(TreeNode root, LinkedList<Integer> path, List<List<Integer>> result, int targetSum){
        if(root == null) return;

        path.addLast(root.val);
        if(targetSum-root.val == 0 && root.left==null && root.right==null)
            result.add(new ArrayList<Integer>(path));
        
        helper(root.left, path, result, targetSum-root.val);
        helper(root.right, path, result, targetSum-root.val);
        path.removeLast();
        
    }
}