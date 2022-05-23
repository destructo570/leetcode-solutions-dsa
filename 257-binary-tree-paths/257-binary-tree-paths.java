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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        recursiveNaive(root,result,"");
        return result;
    }
    
    public void recursiveNaive(TreeNode root, List<String> ans,String path) {
        if(root==null) return;
        path += (path.length() == 0 ? "" : "->") +root.val;
        if(root.left==null && root.right==null) ans.add(path);
        recursiveNaive(root.left,ans,path);
        recursiveNaive(root.right,ans,path);
    }
}