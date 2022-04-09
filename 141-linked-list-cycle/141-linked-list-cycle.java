/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head==null||head.next == null ) return false;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){    
            slow = slow==null ? null : slow.next;
            fast = fast==null ? null : fast.next;
            fast = fast==null ? null : fast.next;
            if(fast==slow) return true;
        }
        
        return false;
    }
}