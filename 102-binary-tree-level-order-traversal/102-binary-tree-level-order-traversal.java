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
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result; 
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> res = new ArrayList<>();
            int level = q.size();
            
            for(int i=0; i<level; i++){
                TreeNode n = q.remove();
                res.add(n.val);
                if(n.left != null) q.add(n.left);
            
                if(n.right != null) q.add(n.right);
                
            }

            result.add(res);
        }
        
        return result;
    }
    
}