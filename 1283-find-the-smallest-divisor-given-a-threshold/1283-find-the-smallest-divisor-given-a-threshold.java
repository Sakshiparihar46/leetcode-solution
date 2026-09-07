class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
       int left=1;
       int right=Integer.MIN_VALUE;
       for(int num:nums){
        right=Math.max(right,num);
       } 
       while(left<right){
        int mid=left+(right-left)/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]%mid)==0){
                sum+=nums[i]/mid;
            }else{
                sum+=nums[i]/mid +1;
            }
        }
        if(sum>threshold){
            left=mid+1;
        }else{
            right=mid;
        }
       }
       return left;
    }
}