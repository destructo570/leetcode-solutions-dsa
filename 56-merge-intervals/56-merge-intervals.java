class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1,i2)->Integer.compare(i1[0], i2[0]));
        int j=0;
        for(int i=j+1; i<intervals.length; i++){
            if(intervals[j][1]>=intervals[i][0]){
                intervals[j]=new int[]{intervals[j][0], Math.max(intervals[j][1], intervals[i][1])};
            }else intervals[++j] = intervals[i];

        }
        return Arrays.copyOfRange(intervals, 0, j+1);
    }
}