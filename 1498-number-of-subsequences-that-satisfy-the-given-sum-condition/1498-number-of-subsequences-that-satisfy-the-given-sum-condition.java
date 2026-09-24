class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod=1000000007;
        Arrays.sort(nums);
        int pow[]=new int[nums.length];
        pow[0]=1;
        for(int i=1;i<nums.length;i++){
            pow[i]=(2*pow[i-1])%mod;
        }
        int left=0;
        int right=nums.length-1;
        int ans=0;
        while(left<=right){
            if((nums[left]+nums[right])<=target){
                ans=(ans+pow[right-left])%mod;
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}