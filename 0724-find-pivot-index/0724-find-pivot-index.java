class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];
        leftsum[0]=nums[0];
        rightsum[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            leftsum[i]=nums[i]+leftsum[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            rightsum[i]=nums[i]+rightsum[i+1];
        }

        
        for(int i = 0; i < nums.length; i++) {

            int left = (i == 0) ? 0 : leftsum[i - 1];
            int right = (i == nums.length - 1) ? 0 : rightsum[i + 1];

            if(left == right) {
                return i;
            }
        }
        return -1;
    }
}