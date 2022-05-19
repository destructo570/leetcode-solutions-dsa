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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null) return result;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        TreeNode lastPop = root;
        while(!st.isEmpty()){
            TreeNode top = st.peek();
            if(top.left!=null && top.left!=lastPop && top.right!=lastPop){
                st.push(top.left);
            }else if(top.right!=null && top.right!=lastPop){
                st.push(top.right);
                result.add(top.val);
            }else{
                st.pop();
                lastPop=top;
                if(top.right==null)
                    result.add(top.val);
            }
            
        } 
        return result;
    }
}