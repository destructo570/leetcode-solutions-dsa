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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }

       Collections.sort(arr);
        ListNode res = new ListNode(0, null);
        ListNode tail = res;
        for(int i=0; i<arr.size(); i++){
            tail.next = new ListNode(arr.get(i), null);
            tail = tail.next;
        }

        return res.next;
        }
}