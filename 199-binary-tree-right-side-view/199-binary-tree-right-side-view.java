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
    public List<Integer> rightSideView(TreeNode root) {
        return levelOrder(root);
    }
    
    public List<Integer> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList();
        
        if(root==null) return result;

        queue.offer(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i=0; i<size; i++){
                TreeNode pop = queue.poll();
                
                if(pop.left != null)
                    queue.offer(pop.left);
                
                if(pop.right != null)
                    queue.offer(pop.right);
                
                if(i==size-1) result.add(pop.val);
            }

        }
        
        return result;
    }
}