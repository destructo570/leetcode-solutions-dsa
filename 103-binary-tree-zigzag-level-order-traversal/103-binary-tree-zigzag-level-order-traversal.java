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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root==null) return result;
        boolean zigzag = false;
        q.offer(root);
        
        while(!q.isEmpty()){
            int size=q.size();
            LinkedList<Integer> list = new LinkedList<>();
            
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                    
                if(zigzag) list.addFirst(curr.val);
                else list.addLast(curr.val);

                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            
            result.add(list);
            zigzag=!zigzag;
        }
        return result;
    }
  

}