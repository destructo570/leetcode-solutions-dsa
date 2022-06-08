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
   public ListNode reverseBetween(ListNode head, int m, int n) {
       
       ListNode dummy = new ListNode(0);
       dummy.next=head;
       ListNode leftPrev = dummy;
       ListNode curr = head;
       
       for(int i=0; i<m-1; i++){
           leftPrev=curr;
           curr=curr.next;
       }
       
       ListNode prev=null;
       
       for(int i=0; i<n-m+1; i++){
           ListNode tmp = curr.next;
           curr.next=prev;
           prev=curr;
           curr=tmp;
       }
       
       leftPrev.next.next = curr;
       leftPrev.next=prev;
    
       return dummy.next;
    }
}