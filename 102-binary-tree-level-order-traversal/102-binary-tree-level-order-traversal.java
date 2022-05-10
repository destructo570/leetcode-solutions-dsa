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
        List<List<Integer>> ans=new ArrayList<>();
        compute(ans,root,0);
        return ans;
    }
    
    public void compute(List<List<Integer>> ans,TreeNode curr,int level)
    {
        if(curr==null) return;
        
        if(ans.size()==level) 
            ans.add(new ArrayList<Integer>());
        
        ans.get(level).add(curr.val);
        
        compute(ans,curr.left,level+1);
        compute(ans,curr.right,level+1);
    }
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> result = new ArrayList<>();
//         for(int i=0; i<=height(root); i++){
//             List<Integer> tmp = new ArrayList<>();
//             getNodesAtKDistance(root,i,tmp);
//             result.add(tmp);
//         }
//         return result;
//     }
    
//     public int height(TreeNode root){
//         if(root==null) return -1;  
//         if(root.left==null && root.right==null) return 0;
//         return 1+Math.max(height(root.left), height(root.right));
//     }

//     private void getNodesAtKDistance(TreeNode root, int distance, List<Integer> result){
//         if(root==null) return;
//         if(distance==0){
//             result.add(root.val);
//             return;
//         }
//         getNodesAtKDistance(root.left, distance-1, result);
//         getNodesAtKDistance(root.right, distance-1, result);
//     }
}