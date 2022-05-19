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
    //int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        int max = 0;
        HashMap<TreeNode, Integer> hm = new HashMap<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode top = stack.peek();
            
            if(top.left!=null && !hm.containsKey(top.left))
                stack.push(top.left);
            else if(top.right!=null && !hm.containsKey(top.right))
                stack.push(top.right);
            else{
                TreeNode node = stack.pop();
                hm.put(node, Math.max(hm.getOrDefault(node.left,0),hm.getOrDefault(node.right,0))+1);
                max = Math.max(max, hm.getOrDefault(node.left,0)+hm.getOrDefault(node.right,0));
            }
        }
        return max;
    }

    
//     public int recursiveSolution(TreeNode root) {
//         depth(root);
//         return max;
//     }
    
//     public int depth(TreeNode root) {
//         if(root==null) return 0;
//         int left = depth(root.left);
//         int right = depth(root.right);
//         max=Math.max(max, left+right);
//         return Math.max(left,right)+1;
//     }
}