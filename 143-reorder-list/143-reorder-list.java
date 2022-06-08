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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode curr = slow.next;
        ListNode prev = null;
        slow.next=null;
        while(curr!=null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        ListNode first=head;
        ListNode second=prev;
        while(second!=null){
            ListNode tmp1=first.next;
            ListNode tmp2=second.next;
            first.next=second;
            second.next=tmp1;
            first=tmp1;
            second=tmp2;
        }
    }
}