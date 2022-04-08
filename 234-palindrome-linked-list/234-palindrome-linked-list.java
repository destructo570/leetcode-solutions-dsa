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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        
        ListNode cur = head;
        while(cur!=null){
            st.push(cur.val);
            cur=cur.next;
        }
        
        cur=head;
        
        while(cur!=null){
            if(cur.val != st.pop()) return false;
            cur=cur.next;
        }
        
        return true;
    }
    
     public boolean isPalindromeOne(ListNode head) {
        ListNode reversed = reverseList(head);
        
        ListNode cur = head;
        ListNode curRev = reversed;
        while(cur!=null){
            if(cur.val != curRev.val) return false;
            
            cur=cur.next;
            curRev=curRev.next;
        }
        
        return true;
    }
    
    
    public ListNode reverseList(ListNode head){
       
        if(head == null) return head;
        
        ListNode prev = head;
        ListNode current = head.next;
        head.next=null;
        while(current!=null){
            ListNode tmp=current.next;
            current.next=prev;
            prev=current;
            current=tmp;
        }
        
        return prev;
        
    }
}