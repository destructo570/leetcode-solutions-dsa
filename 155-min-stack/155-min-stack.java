class MinStack {
    Stack<Integer> s;
    int min;
    public MinStack() {
        s=new Stack<Integer>();
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            min=val;
        }
        if(val<=min){
            s.push(min);
            min=val;
        }
        s.push(val);
    }
    
    public void pop() {
        if(s.peek()==min){
            s.pop();
            min=s.pop();
        }
        else
            s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
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