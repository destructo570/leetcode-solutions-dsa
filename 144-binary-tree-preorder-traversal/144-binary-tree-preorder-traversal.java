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
        return recursive(root);
    }
    
    //======================== UNIVERSAL =================//
    
    public List<Integer> universal(TreeNode root) {
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
            }else if(top.right!=null && top.right!=lastPop){
                st.push(top.right);
                result.add(top.right.val);
            }else{
                st.pop();
                lastPop=top;
            }
        }
        return result;
    }
    
    //======================== ITERATIVE =================//
    
    public List<Integer> iterative(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null) return result;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode current = st.pop();
            result.add(current.val);
            if(current.right!=null) st.push(current.right);
            if(current.left!=null) st.push(current.left);
        } 
        return result;
    }
    
    //======================== RECURSIVE =================//
    
    public List<Integer> recursive(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        return traverse(root, result);
    }
    
    public List<Integer> traverse(TreeNode root, ArrayList<Integer> res) {
        if(root == null) return res;
		
        res.add(root.val);
        traverse(root.left, res);
        traverse(root.right, res);
        return res;
    }
}