import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        final PriorityQueue<BigInteger> pq = new PriorityQueue<>();
        for(String val : nums){ 
            pq.offer(new BigInteger(val));
            if(pq.size()>k) pq.poll();
        }
        
        return pq.peek().toString();
    }
}