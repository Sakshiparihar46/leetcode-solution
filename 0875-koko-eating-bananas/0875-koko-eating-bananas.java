class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left=1;
        int right=piles[piles.length-1];
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