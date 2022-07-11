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
        ListNode resHead = null;
        ListNode end = head;
        ListNode prevTail = null;
        int size=1;
        while(end!=null){
            size++;
            end=end.next;
            if(size==k+1){
                size=1;
                ListNode newHead = reverseList(begin, end);
                if(resHead==null) resHead=newHead;
                if(prevTail!=null) prevTail.next=newHead;
                prevTail=begin;
                begin=end;
            }
        }
        
        //if(size==k && k>1) return reverseList(begin, end);
        return resHead;
    }
    
    public ListNode reverseList(ListNode begin, ListNode end) {
        if(begin==null || begin.next==null) return begin;
        
        ListNode prev = begin;
        ListNode curr = begin.next;
        prev.next=end;
        while(curr!=end){
            ListNode tmp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=tmp;
        }
        
        return prev;
    }
}