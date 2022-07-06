/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var sortList = function(head) {
    const arr = [];
    let curr = head;
    while(curr!==null){
        arr.push(curr.val);
          curr=curr.next;
    }
    
    arr.sort((a,b)=> a-b);
    let res = new ListNode(0, null);
    let tail = res;
    for(let num of arr){
        tail.next = new ListNode(num, null);
        tail = tail.next;
    }
    
    return res.next;
};