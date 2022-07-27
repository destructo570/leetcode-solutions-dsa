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
    public int maxLevelSum(TreeNode root) {
    
        Queue<TreeNode> q = new LinkedList<>();
        
        int max = Integer.MIN_VALUE;
        int maxLevel = 0;
        int currLevel = 0;
        
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            int sum = 0;
            currLevel++;
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                
                sum+=curr.val;
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            
            }
            
            if(max<sum){
                maxLevel=currLevel;
                max=sum;
            }
        }
        
        return maxLevel;
    }
    
    
}