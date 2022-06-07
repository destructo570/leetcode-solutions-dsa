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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode result = new ListNode(0);
        result.next=head;
        ListNode tail = result;
        ListNode curr = head;
        while(curr!=null){
            while(curr.next!=null && curr.val==curr.next.val)
                curr=curr.next;
            
            if(tail.next==curr)
                tail=tail.next;
            else
                tail.next=curr.next;
            
            curr=curr.next;
        }
        

        return result.next;
    }
}