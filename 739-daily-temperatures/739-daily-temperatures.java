class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> stack = new Stack<>();
    int[] ret = new int[temperatures.length];
    for(int i = 0; i < temperatures.length; i++) {
        while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
            int idx = stack.pop();
            ret[idx] = i - idx;
        }
        stack.push(i);
    }
    return ret;
    }
    
    public int[] optimalTwo(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int tmp =0;
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                tmp = st.pop();
                result[tmp] = i-tmp;
            }
            st.push(i);
        }
        return result;
    }
    
    public int[] optimal(int[] arr) {
        int[] result = new int[arr.length];
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                hm.put(st.pop(), i);
            }
            st.push(i);
        }
       
        for(int i=0; i<result.length; i++){
            result[i] = (hm.get(i)!=null?hm.get(i)-i:0);
        }
        return result;
    }
    
    public int[] naive(int[] arr) {
        int[] result = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=i+1; j<arr.length; j++){
                count++;
                if(arr[j]>arr[i]){
                    result[i]=count;            
                    break;
                }
            }
        }
        
        return result;
    }
}