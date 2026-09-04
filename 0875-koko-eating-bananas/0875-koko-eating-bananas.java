class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int pile:piles){
            right=Math.max(right,pile);
        }
        int min=Integer.MAX_VALUE;
        while(left<right){
            int mid=left+(right-left)/2;
            int sum=0;
            for(int i=0;i<piles.length;i++){
                if(piles[i]%mid!=0){
                    sum+=piles[i]/mid +1;
                }else{
                    sum+=piles[i]/mid;
                }
            }
            if(sum<=h){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}