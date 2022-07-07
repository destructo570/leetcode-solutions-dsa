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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        
        ListNode less = new ListNode(0);
        ListNode lessTail = less;
        ListNode greater = new ListNode(0);
        ListNode greaterTail = greater;
        
        ListNode curr = head;
        while(curr!=null){
            if(curr.val<x){
                lessTail.next = curr;
                lessTail = lessTail.next;

            }else{
                greaterTail.next = curr;
                greaterTail = greaterTail.next;
            }
            
            curr=curr.next;
        }
        greaterTail.next=null;
        lessTail.next=greater.next;
        return less.next;
    }
}