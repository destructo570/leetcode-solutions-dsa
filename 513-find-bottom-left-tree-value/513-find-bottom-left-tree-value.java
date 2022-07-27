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
    public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> list = levelOrder(root);
        return list.get(list.size()-1).get(0);
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList();
        
        if(root==null) return result;

        queue.offer(root);
        
        while(!queue.isEmpty()){
            List<Integer> r = new ArrayList();
            int size = queue.size();
            
            for(int i=0; i<size; i++){
                TreeNode pop = queue.poll();
                r.add(pop.val);
                if(pop.left != null)
                    queue.offer(pop.left);
                
                if(pop.right != null)
                    queue.offer(pop.right);
            }
            
            result.add(r);
        }
        
        return result;
    }
}