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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return optimalOne(list1,list2);
    }
    
    public ListNode optimalOne(ListNode list1, ListNode list2){
        ListNode a = list1;
        ListNode b = list2;
        ListNode head = null;
        ListNode tail = null;
        
        if(list1==null) return list2;
        if(list2==null) return list1;
        
        
         while(a!=null && b!=null){
             if(a.val<b.val){
                 ListNode tmp = a.next;
                 if(head==null) {
                     head=a;
                     tail=a;
                 }
                 tail.next=a;
                 tail=a;
                 a.next=b;
                 a=tmp;
             }else{
                 ListNode tmp = b.next;
                 if(head==null) {
                     head=b;
                     tail=b;
                 }
                 tail.next=b;
                 tail=b;
                 b.next=a;
                 b=tmp;
             }
         }
        return head;
        
    }
    
    public ListNode naive(ListNode list1, ListNode list2){
        
        ListNode result = null;
        ListNode resultTail = null;
        
        ListNode a = list1;
        ListNode b = list2;
        
        while(a!=null && b!=null){
            ListNode n = new ListNode();
            if(a.val<b.val){
                n.val=a.val;
                if(result==null) {
                    result = n;
                    resultTail = n;
                }else {
                    resultTail.next = n;
                    resultTail = n;                    
                }
                a=a.next;
            }else{
                n.val=b.val;
                if(result==null) {
                    result = n;
                    resultTail = n;
                }else {
                    resultTail.next = n;
                    resultTail = n;                    
                }
                b=b.next;
            }
        }
        
        while(a!=null){
            ListNode n = new ListNode();
            n.val=a.val;
            if(result==null) {
                result=n;
                resultTail=n;
            }else{
                
            resultTail.next = n;
            resultTail = n;
            resultTail.next = null;
            }
            a=a.next;
        }
        
        while(b!=null){
            ListNode n = new ListNode();
            n.val=b.val;
            if(result==null) {
                result=n;
                resultTail=n;
            }else{
            resultTail.next = n;
            resultTail = n;
            resultTail.next = null;
            }
            b=b.next;
        }
        
        return result;
    }
}