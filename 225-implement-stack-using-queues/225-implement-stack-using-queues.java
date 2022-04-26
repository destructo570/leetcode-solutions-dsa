class MyStack {
    
    Queue<Integer> q1;
    Queue<Integer> q2;
    int top = -1;

    public MyStack() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
        top=x;
    }
    
    public int pop() {
        Integer item = null;
        while(q1.size()>1){
            top = q1.remove();
            q2.add(top);
        }
        item = q1.remove();
        
        Queue<Integer> tmp = q1;
        q1=q2;
        q2=tmp;
        return item; 
    }
    
    public int top() {
        return this.top;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */