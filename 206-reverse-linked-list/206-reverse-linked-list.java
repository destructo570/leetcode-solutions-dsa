/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null) return head;
        
        ListNode prev = head;
        ListNode current = head.next;
        head.next=null;
        while(current!=null){
            ListNode tmp=current.next;
            current.next=prev;
            prev=current;
            current=tmp;
        }
        
        return prev;
        
    }
    
    
    public ListNode reverseListOne(ListNode head) {
        
        if(head==null) return null;

        ListNode current = head.next;
        ListNode previous = head;
  
        while (current!=null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        head.next=null;
        return previous;
        
    }
}