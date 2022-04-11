/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //Store the traversed node in a hashmap
        //Loop one list and store all nodes in the hashset
        //Loop second list and check if node is preesnt in the hs
        //If present return the node
        //Else return null
        
        HashSet<ListNode> hs = new HashSet<>();
        
        ListNode curL1 = headA;
        ListNode curL2 = headB;
        
        while(curL1!=null){
            hs.add(curL1);
            curL1=curL1.next;
        }
        
        while(curL2!=null){
            
            if(hs.contains(curL2))
                return curL2; 
            
            curL2=curL2.next;
        }
        
        return null;
    }
}