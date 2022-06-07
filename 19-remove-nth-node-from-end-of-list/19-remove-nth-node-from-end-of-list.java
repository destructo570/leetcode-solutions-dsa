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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev=head;
        ListNode slow = head;
        ListNode fast = head;
        int distance=0;
        while(distance!=n){
            fast=fast.next;
            distance++;
        }
        
        if(fast==null) return head.next;
        
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        
        return head;
    }
}