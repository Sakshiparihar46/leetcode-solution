class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;
        for(int bloom:bloomDay){
            left=Math.min(left,bloom);
            right=Math.max(right,bloom);
        }

        while(left<right){
            int mid=left+(right-left)/2;
            int count=0;
            int bouquet=0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    count++;
                    if(count==k){
                        count=0;
                        bouquet++;
                    }
                }else{
                    count=0;
                }
            }
            if(bouquet>=m){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}