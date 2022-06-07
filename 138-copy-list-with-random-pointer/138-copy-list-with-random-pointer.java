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
        Node curr = head;
        Node next = head;
        
        while(curr!=null){
            next=curr.next;
            Node copy = new Node(curr.val);
            curr.next=copy;
            copy.next=next;
            curr=next;
        }
        
        curr=head;
        
        while(curr!=null){
            if(curr.random!=null)
                curr.next.random=curr.random.next;
            curr=curr.next.next;
        }
        
        curr=head;
        Node result = new Node(0);
        Node tail = result;
        
        while(curr!=null){
            next=curr.next.next;
            tail.next=curr.next;
            tail=tail.next;
            curr.next=next;
            curr=next;
        }
        return result.next;
    }
}