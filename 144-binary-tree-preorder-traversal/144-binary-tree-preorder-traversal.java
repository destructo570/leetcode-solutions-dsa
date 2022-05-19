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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null) return result;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        result.add(root.val);
        TreeNode lastPop = root;
        while(!st.isEmpty()){
            TreeNode top = st.peek();
            if(top.left!=null && top.left!=lastPop && top.right!=lastPop){
                st.push(top.left);
                result.add(top.left.val);
            }else if(top.right!=null && top.right!=lastPop && (top.left==null || top.left==lastPop)){
                st.push(top.right);
                result.add(top.right.val);
            }else{
                st.pop();
                lastPop=top;
            }
            
        }
        
        
        return result;
    }
    
//     public List<Integer> preorderTraversalOne(TreeNode root) {
//         ArrayList<Integer> result = new ArrayList<>();
//         if(root==null) return result;
//         Stack<TreeNode> st = new Stack<>();
//         st.push(root);
//         while(!st.isEmpty()){
//             TreeNode current = st.pop();
//             result.add(current.val);
//             if(current.right!=null) st.push(current.right);
//             if(current.left!=null) st.push(current.left);
//         }
        
        
//         return result;
//     }
}