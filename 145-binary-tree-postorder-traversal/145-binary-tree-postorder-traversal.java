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
    public List<Integer> postorderTraversal(TreeNode root) {
        return universal(root);
    }
    
    public List<Integer> universal(TreeNode root) {
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
            }else{
                st.pop();
                lastPop=top;
                result.add(top.val);
            }
            
        } 
        return result;
     
    }
    
    public List<Integer> postorderOne(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        if(root==null) return result;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode current = st.pop();
            if(current.left!=null)st.push(current.left);
            if(current.right!=null)st.push(current.right);
            result.addFirst(current.val);
        }
        
        return result;
    }
    
    public List<Integer> traverse(TreeNode root, ArrayList<Integer> res) {
        
        if(root == null) return res;
        traverse(root.left, res);
        traverse(root.right, res);
        res.add(root.val);
        return res;
    }
}