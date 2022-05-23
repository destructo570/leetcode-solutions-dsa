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
        recursive(root,result,"");
        return result;
    }
    
    public void recursive(TreeNode root, List<String> ans,String path) {
        if(root==null) return;
        path = path+root.val;
        if(root.left==null && root.right==null) ans.add(path);
        else path=path+"->";
        recursive(root.left,ans,path);
        recursive(root.right,ans,path);
    }
}