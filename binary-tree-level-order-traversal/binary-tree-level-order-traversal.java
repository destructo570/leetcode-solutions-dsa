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
        if(root==null) return result;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> r = new ArrayList<>();
            int level = q.size();
            for(int i=0; i<level; i++){
                TreeNode current = q.poll();
                 r.add(current.val);
                if(current.left!=null) q.offer(current.left);
                if(current.right!=null) q.offer(current.right);       
            }
            result.add(r);
        }
        return result;
    }
}