// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node l1, Node l2){
        Node num1 = reverse(l1);
        Node num2 = reverse(l2);
        
        Node head = new Node(0);
        Node tail = head;
        int carry=0;
        
        while(num1!=null || num2!=null || carry!=0){
            int a = num1 == null ? 0 : num1.data;
            int b = num2 == null ? 0 : num2.data;
            int sum = a + b + carry;
            
            if(sum>9){
                carry=1;
                tail.next = new Node(sum%10);
                tail = tail.next;
            }else{
                carry=0;
                tail.next = new Node(sum);
                tail = tail.next;
            }
            
            num1 = num1 == null ? null : num1.next;
            num2 = num2 == null ? null : num2.next;
        }
        
        
        head = reverse(head.next);
        return head;
    }
    
    
       static Node reverse(Node head){
        if(head==null|| head.next==null)
            return head;
        Node prev=null, curr=head, nextNode=head;
        while(nextNode!=null){
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        
        return prev;
    }
}