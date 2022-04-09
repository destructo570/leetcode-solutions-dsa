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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null || head.next==null) return null;
        
        ListNode cur = head;
        ListNode prev = head;
        int count=0;
        
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        
        count=count/2 - 1;
        cur = head.next;
        while(count!=0){
            prev=cur;
            cur=cur.next;
            count--;
        }
        
        prev.next=cur.next;
        cur.next=null;
        return head;
            
         
    }
    
//     if(head==null) return head;
        
//         ListNode slow = head;
//         ListNode fast = head;
//         ListNode prev = head;
        
//         while(fast!=null && fast.next!=null){
//             prev=slow;
//             slow=slow.next;
//             fast=fast.next.next;
//         }
        
        
//         prev = slow.next;
//         slow.next=null;
//         return head;
}