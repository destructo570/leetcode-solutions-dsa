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
               
        ListNode a = headA;
        ListNode b = headB;
        
        while(a!=b){
            a=a==null?headB:a.next;
            b=b==null?headA:b.next;
        }
        
        return a;
    }
    
    
    public ListNode getIntersectionNodeByHashing(ListNode headA, ListNode headB) {
        
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