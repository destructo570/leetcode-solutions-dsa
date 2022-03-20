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
        //make a new linked list of size l1+l2
        //make two variables keeping track of current nodes in both lists
        //run a loop until there are elements in both lists
        //compare both current nodes add the smaller element to the new list and point to the next node
        //add any elements left in the lists in the new result list
        
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