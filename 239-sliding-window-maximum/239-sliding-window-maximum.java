class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        return optimalDeque(nums, nums.length, k);
    }
    
    public static int[] optimalDeque(int[] arr, int N, int K){
        Deque<Integer> dq = new LinkedList<>();
        int[] result = new int[N-K+1];
        int idx=0;

       for(int i=0; i<arr.length; i++){
           //remove out of bound elements
            if(!dq.isEmpty() && dq.peek() == i-K)
                dq.poll();

            //remove all smaller elements than current element
           while(!dq.isEmpty() && arr[dq.peekLast()]<arr[i])
                dq.pollLast();

           dq.offer(i);
           if(i >= K-1){
               result[idx++]=arr[dq.peek()];
           }
        }

        return result;
    }
    
    
    
    public static int[] optimal(int[] arr, int N,int K){
        int max = findMax(arr, 0, K-1);
        
        ArrayList<Integer> res = new ArrayList<>();

        res.add(max);

        for(int i=K; i<N; i++){
            int removed = arr[i-K];
            int added = arr[i];
            if(removed==max){
                max = findMax(arr, (i-K)+1, i-1);
            }
            max = Math.max(max, added);

            res.add(max);
        }
        int[] f = new int[res.size()];
        
        for(int i=0; i<res.size(); i++)
            f[i]=res.get(i);
        
        return f;
    }

    public static int findMax(int[] arr, int start, int end){
        int max = Integer.MIN_VALUE;

        for(int i=start; i<=end; i++)
            if(arr[i]>max)max=arr[i];

        return max;
    }
}