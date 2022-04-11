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
    public int getDecimalValue(ListNode head) {
        
        int count = 0;
        int power = 0;
        int sum = 0;
        ListNode cur = head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        
        power = count-1;
        cur=head;
        
        while(cur!=null){
            if(cur.val == 1)
                sum+=(int)Math.pow(2, power);
            power--;
            cur=cur.next;
        }
        
        return sum;
        
    }
}