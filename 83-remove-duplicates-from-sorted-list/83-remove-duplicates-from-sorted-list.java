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
            if(head==null) return head;
            ListNode prev = head;
    		ListNode cur = head.next;
    		
    		while(cur != null){
    		    if(prev.val == cur.val){
    		        ListNode tmp = cur.next;
    		        cur.next=null;
    		        prev.next=tmp;
    		        cur=tmp;
    		    }else{
    		        prev=cur;
    		        cur=cur.next;
    		    }
    		}
    		
    		return head;
    }
}