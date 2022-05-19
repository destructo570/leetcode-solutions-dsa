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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        Stack<TreeNode> st = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        TreeNode lastPop = root;
        st.push(root);
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
                if(top.right==null) result.add(top.val);
            }
        }
        
        return result.get(k-1);
    }
}