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
    
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        
        ListNode fast = head;
        ListNode slow = head;
        int size=1;
        while(fast.next!=null){
            fast=fast.next;
            size++;
        }
        
        for(int i=size-k%size; i>1; i--){
            slow=slow.next;
        }
        
        fast.next=head;
        head=slow.next;
        slow.next=null;
        
        return head;
    }
    
    
    public ListNode naive(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode mainHead = head;
        int count=k%countNodes(head);

        while(count!=0){
            mainHead = rotate(mainHead);
            count--;
        }
        return mainHead;
    }
    
    public ListNode rotate(ListNode head){
        ListNode prev = head;
        ListNode curr = head.next;
        
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        
        prev.next=null;
        curr.next=head;
        head=curr;
        
        return curr;
    }
    
    public int countNodes(ListNode head){
        ListNode curr = head;
        int count=0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
    
        return count;
    }
    
}