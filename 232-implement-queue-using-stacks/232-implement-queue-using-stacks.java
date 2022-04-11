class MyQueue {
    
    Stack<Integer> enq = new Stack<>();
    Stack<Integer> deq = new Stack<>();
    int top;
    public MyQueue() {}
    
    public void push(int x) {
        if(enq.isEmpty())
            top=x;
        enq.push(x);
    }
    
    public int pop() {
        int item = -1;
        
        while(!enq.isEmpty())
            deq.push(enq.pop());
        
        item = deq.pop();
        top = deq.isEmpty() ? 0 : deq.peek();
        
        while(!deq.isEmpty())
            enq.push(deq.pop());
        
        return item;
    }
    
    public int peek() {
        return top;
    }
    
    public boolean empty() {
        return enq.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */