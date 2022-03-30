class MinStack {
    int min=Integer.MAX_VALUE;
    LinkedList<Integer> ll = new LinkedList<>();

    public MinStack() {

    }

    public void push(int val) {
        ll.addLast(val);
        if(val<min || ll.isEmpty())
            min=val;
    }

    public void pop() {
        int item=ll.removeLast();
        if(item==min){
            int newMin = Integer.MAX_VALUE;
            for (int num:ll){
                if(num<newMin)newMin=num;
            }
            min=newMin;
        }
    }

    public int top() {
        return ll.getLast();
    }

    public int getMin() {
        if(ll.isEmpty()) return 0;
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