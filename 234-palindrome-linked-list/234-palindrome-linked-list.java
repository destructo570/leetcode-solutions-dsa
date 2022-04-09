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
        
        return isPalindromeUsingNum(head);
    }
    
    public boolean isPalindromeUsingNum(ListNode head) {
        int num1 = 0;
        int num2 = 0;
        int s = 1;
        ListNode current = head;

        while(current!=null){
            num1 = (num1*10) + current.val;
            num2 = num2 + (current.val*s);
            s*=10;
            current = current.next;
        }

        return num1 == num2;
    }
    
    public boolean isPalindromeUsingStack(ListNode head) {
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