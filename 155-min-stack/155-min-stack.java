class MinStack {
    
    ListNode head = null;
    
    public MinStack() {}
    
    public void push(int val) {
        if(head==null){
            head = new ListNode(val, val, null);
            
        }else{
            ListNode n = new ListNode(val, Math.min(head.min, val), null);
            n.next=head;
            head=n;
        }
    }
    
    public void pop() {
        ListNode n = head;
        head = head.next;
        n.next=null;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
    
    private class ListNode{
        int val;
        int min;
        ListNode next;
        
        public ListNode(int val, int min, ListNode next){
            this.val=val;
            this.min=min;
            this.next=next;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */