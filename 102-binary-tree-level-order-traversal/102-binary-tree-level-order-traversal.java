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
        List<List<Integer>> result = new ArrayList<>();
        traverse(root, result, 0);
        return result;
    }
    
    public void traverse(TreeNode root, List<List<Integer>> result, int level){
        if(root==null) return;
        
        if(result.size()==level)
            result.add(new ArrayList<Integer>());
        
        result.get(level).add(root.val);
        traverse(root.left, result, level+1);
        traverse(root.right, result, level+1);
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