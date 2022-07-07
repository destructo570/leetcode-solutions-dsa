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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        int i=0;
        head = swap(null, head, head.next);
        ListNode sprev=null;
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null){
            if(i>0 && i%2==0) {
                swap(sprev, prev, curr);
                curr=prev.next;
            }else{
                sprev=prev;
                prev=curr;
                curr=curr.next;
            }
            
            i++;
        }
        return head;
    }
    
    public ListNode swap (ListNode s0, ListNode s1, ListNode s2){
        ListNode tmp = s2.next;
        s2.next=s1;
        s1.next=tmp;
        if(s0!=null)s0.next=s2;
        return s2;
    }
}