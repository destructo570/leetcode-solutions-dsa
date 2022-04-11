class MyQueue {
    
    Stack<Integer> enq = new Stack<>();
    Stack<Integer> deq = new Stack<>();
    
    public MyQueue() {}
    
    public void push(int x) {
        enq.push(x);
    }
    
    public int pop() {
        peek();
        
        return deq.pop();
    }
    
    public int peek() {
        if(deq.isEmpty())
             while(!enq.isEmpty())
                deq.push(enq.pop());
        
        return deq.peek();
    }
    
    public boolean empty() {
        return enq.isEmpty() && deq.isEmpty();
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