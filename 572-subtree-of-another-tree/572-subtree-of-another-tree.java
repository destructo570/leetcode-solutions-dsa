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
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(isSameTree(root,subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
    
        return (p.val==q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    
    public boolean isSubtreew(TreeNode root, TreeNode subRoot) {
        List<Integer> base = inOrder(root);
        List<Integer> sub = inOrder(subRoot);
        System.out.println(base);
        System.out.println(sub);
        int j=0;
        int count=0;
        for(int i=0; i<base.size(); i++){
            if(base.get(i)==sub.get(j)){
                count++;
                j++;
            }else{
                count=0;
                j=0;
            }
            
            if(count==sub.size()) return true;
        }
        
        return false;
    }
    
    public List<Integer> inOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        List<Integer>result = new ArrayList<>();    
        
        while(!stack.isEmpty() || root!=null){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            result.add(root.val);
            root=root.right;
        }
        return result;
    }
}