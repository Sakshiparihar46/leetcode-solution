class Solution {
    public int minimumDeletions(int[] nums) {
        int min_indx=0;
        int max_indx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[max_indx]<nums[i]){
                max_indx=i;
            }
            if(nums[min_indx]>nums[i]){
                min_indx=i;
            }
        }

        int sum1=Math.max(max_indx,min_indx)+1;
        int sum2=nums.length-Math.min(max_indx,min_indx);
        int sum3=Math.min(max_indx,min_indx)+nums.length-Math.max(max_indx,min_indx)+1;

        return Math.min(sum1,Math.min(sum2,sum3));
    }
}