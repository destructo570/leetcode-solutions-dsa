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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return result;
        // boolean flag = false;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list = new ArrayList<>();
            
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                list.add(curr.val);    
                // if(!flag){
                    // if(curr.right!=null) q.offer(curr.right);
                    // if(curr.left!=null) q.offer(curr.left);
                // }else{
                    if(curr.left!=null) q.offer(curr.left);
                    if(curr.right!=null) q.offer(curr.right);
                // }
            }
            
            result.add(list);
            
            // flag=flag?false:true;
        }
        
         for(int i=1; i<result.size(); i+=2){
             result.set(i, reverseArrayList(result.get(i)));
         }
        
        
        return result;
    }
    
    public List<Integer> reverseArrayList(List<Integer> alist)
    {
        // Arraylist for storing reversed elements
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {
 
            // Append the elements in reverse order
            revArrayList.add(alist.get(i));
        }
 
        // Return the reversed arraylist
        return revArrayList;
    }
}