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
        ListNode begin = head;
        ListNode end = head;
        ListNode dummy = new ListNode(-1);
        ListNode dummyTail = dummy;
        int size=1;
        while(end!=null){
            size++;
            end=end.next;
            if(size==k+1){
                size=1;
                ListNode node = reverseList(begin, end);
                dummyTail.next = node;
                dummyTail = begin;
                begin=end;
            }
        }
        dummyTail.next=begin;
        return dummy.next;
    }
    
    public ListNode reverseList(ListNode begin, ListNode end) {
        if(begin==null || begin.next==null) return begin;
        
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