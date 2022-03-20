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
    public ListNode mergeKLists(ListNode[] lists) {
        
//         ListNode res = null;
        
//         for(int i=0; i<lists.length; i++){
//             if(res==null) res=lists[i];
//             else res=mergeTwo(res, lists[i]);
//         }
        
//         return res;
        return mergeSort(lists, 0, lists.length-1);
    }
    
    public ListNode mergeSort(ListNode[] lists, int lo,int hi){
        if(lo>hi)return null;
        if(lo==hi)return lists[lo];
        
        int mid = (lo+hi)/2;
        ListNode left = mergeSort(lists, lo, mid);
        ListNode right = mergeSort(lists, mid+1, hi);
        return mergeTwo(left, right);
        
    }
    
    public ListNode mergeTwo(ListNode l1, ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode res = new ListNode(0);
        ListNode current = res;
        
         while(l1!=null && l2!=null){
             if(l1.val<l2.val){
                 current.next=l1;
                 current=l1;
                 l1=l1.next;
             }else{
                 current.next=l2;
                 current=l2;
                 l2=l2.next;
             }
         }
         
         current.next = l1==null ? l2 : l1;
         
        return res.next;
        
    }
}