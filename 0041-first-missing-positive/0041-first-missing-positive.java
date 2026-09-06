class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int freq[]=new int[n+1];

        for(int num:nums){
            if(num>0  && num<=n){
                freq[num]=1;
            }
        }

        for(int i=1;i<=n;i++){
            if(freq[i]==0){
                return i;
            }
        }
        return n+1;
    }
}