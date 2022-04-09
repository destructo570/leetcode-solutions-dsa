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
        
        //Find longer number and store it int num1
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
    
    
     public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        
        //Find longer number and store it int num1
        ListNode num1 = l1;
        ListNode num2 = l2;
        ListNode head = null;
        
        while(num1!=null || num2!=null){
            if(num1==null){
                num1 = l2;
                num2 = l1;
                break;
            }else if(num2==null){
                num1 = l1;
                num2 = l2;
                break;
            }
            num1=num1.next;
            num2=num2.next;
        }
        
        if(num1==null && num2==null){
            num1=l1;
            num2=l2;
        }
        
        head = num1;
        
        int carry=0;
        ListNode last = null;
        while(num1!=null && num2!=null){
            int sum = num1.val+num2.val+carry;
            
            if(sum>9){
                carry=1;
                num1.val=sum%10;
            }else{
                carry=0;
                num1.val=sum;
            }
            if(num1.next==null) last=num1;
            num1=num1.next;
            num2=num2.next;
        }
        
        while(num1!=null){
            int sum = num1.val+carry;
             if(sum>9){
                carry=1;
                num1.val=sum%10;
            }else{
                carry=0;
                num1.val=sum;
            }
            if(num1.next==null) last=num1;
            
            num1=num1.next;
            
        }
        
        if(carry>0)
           last.next = new ListNode(1);
        
        
        return head;
    }
}