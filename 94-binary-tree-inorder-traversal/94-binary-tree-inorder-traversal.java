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
        return recursive(root);
    }
    
    //======================== UNIVERSAL =================//
    
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
    
    //======================== ITERATIVE =================//
    
    public List<Integer> iterative(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null) return result;
        Stack<TreeNode> st = new Stack<>();
        
        while(!st.isEmpty() || root!=null){
            while(root!=null){
                st.push(root);
                root=root.left;
            }
            
            root=st.pop();
            result.add(root.val);
            root=root.right;
        } 
        return result;
    }
    
    
    //======================== RECURSIVE =================//
    
    public List<Integer> recursive(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        return recTraverse(root, result);
    }
    
        //======================== ITERATIVE =================//
    
    public List<Integer> recTraverse(TreeNode root, List<Integer> result) {
        if(root==null) return result;
        
        recTraverse(root.left, result);
        result.add(root.val);
        recTraverse(root.right, result);
        return result;
    }
}