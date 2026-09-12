class Solution {
    public int maxDistance(int[] position, int m) {
       Arrays.sort(position); 
       int left=1;
       int right=position[position.length-1]-position[0];
       while(left<=right){
        int mid=left+(right-left)/2;
        int first=position[0];
        int count=1;
        for(int i=1;i<position.length;i++){
           if((position[i]-first)>=mid){
            count++;
            first=position[i];
           } 
        }
        if(count<m){
            right=mid-1;
        }else{
            left=mid+1;
        }
       }
       return right;
    }
}