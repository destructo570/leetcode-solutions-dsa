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
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        ListNode curr = head;
        while(curr!=null){
            hm.put(curr.val, hm.getOrDefault(curr.val,0)+1);
            curr=curr.next;
        }
        
        ListNode result = new ListNode(0);
        ListNode tail = result;
        
        curr = head;
        while(curr!=null){
            if(hm.get(curr.val)==1){
                tail.next=curr;
                tail=tail.next;
            }
            curr=curr.next;
        }
        tail.next=null;
        return result.next;
    }
}