class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=Integer.MIN_VALUE;
        int right=0;
        for(int weight:weights){
            left=Math.max(left,weight);
            right+=weight;
        }

        while(left<right){
            int mid=left+(right-left)/2;
            int count=0;
            int i=0;
            while(i<weights.length){
                int sum=0;
                while(i<weights.length && sum+weights[i]<=mid){
                    sum+=weights[i];
                    i++;
                }
                count++;
            }
            if(count<=days){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}