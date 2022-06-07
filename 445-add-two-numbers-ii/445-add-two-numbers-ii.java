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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = reverseList(l1);
        ListNode n2 = reverseList(l2);
        ListNode result = reverseList(add(n1,n2));
        return result;
    }
    
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        
        ListNode p = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return p;
    }
    
    public ListNode add(ListNode l1, ListNode l2) {
        
        ListNode num1 = l1;
        ListNode num2 = l2;
        
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int carry=0;
        
        while(num1!=null || num2!=null || carry!=0){
            int a = num1 == null ? 0 : num1.val;
            int b = num2 == null ? 0 : num2.val;
            int sum = a + b + carry;
            
            if(sum>9){
                carry=1;
                tail.next = new ListNode(sum%10);
                tail = tail.next;
            }else{
                carry=0;
                tail.next = new ListNode(sum);
                tail = tail.next;
            }
            
            num1 = num1 == null ? null : num1.next;
            num2 = num2 == null ? null : num2.next;
        }
        
        return head.next;
    }
}
    