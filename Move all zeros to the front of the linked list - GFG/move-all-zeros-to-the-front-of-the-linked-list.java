// { Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Zeroes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Node head=null;
            Node curr=null;
            while(n-->0){
                int a=sc.nextInt();
                if(head==null){
                    head=new Node(a);
                    curr=head;
                }
                else{
                    Node temp=new Node(a);
                    temp.next=null;
                    curr.next=temp;
                    curr=temp;
                }
            }
            GfG g=new GfG();
            head = g.moveZeroes(head);
            while(head!=null){
                System.out.print(head.data+" ");
                head=head.next;
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/

class GfG{
    public Node moveZeroes(Node head){
        Node n1 = head;
        Node result = new Node(0);
        Node tail = result;
        while(n1!=null){
            if(n1.data==0){
                tail.next = new Node(n1.data);
                tail = tail.next;
            }
            n1=n1.next;
        }
        n1=head;
        while(n1!=null){
            if(n1.data!=0){
                tail.next = new Node(n1.data);
                tail = tail.next;
            }
            n1=n1.next;
        }
    
        return result.next;
        
    }
}