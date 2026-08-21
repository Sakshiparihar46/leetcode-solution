class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
       for(int i=0;i<k;i++){
        sum+=nums[i];
       } 
        int maxVal=sum;
        int j=k;
        int i=0;
        while(j<nums.length){
            sum+=nums[j++]-nums[i++];
            maxVal=Math.max(maxVal,sum);
        } 
        double avg=(double)maxVal/k;
        return avg;
    }
}