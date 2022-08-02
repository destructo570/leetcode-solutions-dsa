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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root==null) return result;
        q.offer(root);
        
        while(!q.isEmpty()){
            int size=q.size();
            LinkedList<Integer> list = new LinkedList<>();
            
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                    
                list.addLast(curr.val);

                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            
            result.addFirst(list);

        }
        return result;
    }
}