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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode end = head;
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        int count=1;
        
        while(end!=null){
            count++;
            end=end.next;
            if(count==k+1){
                count=1;
                ListNode node = reverseList(head, end);
                tail.next = node;
                tail = head;
                head=end;
            }
        }
        tail.next=head;
        return dummy.next;
    }
    
    public ListNode reverseList(ListNode begin, ListNode end) {
        ListNode prev = begin;
        ListNode curr = begin.next;
        prev.next=null;
        while(curr!=end){
            ListNode tmp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=tmp;
        }
        
        return prev;
    }
}