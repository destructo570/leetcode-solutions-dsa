import java.math.BigInteger;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        return quickSelect(nums,0,nums.length-1,k);
    }
    
    
    public int quickSelect(int[] nums, int lo, int hi, int k) {
        
       int j = lo;
       
        for(int i=lo; i<hi; i++){
            if(nums[i]<=nums[hi])
                swap(nums, i, j++);
        }
        swap(nums,j,hi);
        int count=hi-j+1;
        if(count==k) return nums[j];
        if(count>k) return quickSelect(nums,j+1,hi,k);
        
        return quickSelect(nums,lo,j-1,k-count);
    }
    
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    
    public int findKthLargestUsingHeap(int[] nums, int k) {
        
       final PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : nums){ 
            pq.offer(val);
            if(pq.size()>k) pq.poll();
        }
        
        return pq.peek();
    }
    


}