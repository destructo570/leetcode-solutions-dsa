/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        HashMap<Node,Node> hm = new HashMap<>();
        Node curr = head;
        Node result = new Node(0);
        Node tail = result;
        
        while(curr!=null){
            Node n = new Node(curr.val);
            tail.next = n;
            tail=n;
            
            hm.put(curr, n);
            curr=curr.next;
        }
        
        curr=head;
        Node newCurr=result.next;
        while(curr!=null){
            newCurr.random=hm.get(curr.random);
            curr=curr.next;
            newCurr=newCurr.next;
        }
        
        return result.next;
    }
}