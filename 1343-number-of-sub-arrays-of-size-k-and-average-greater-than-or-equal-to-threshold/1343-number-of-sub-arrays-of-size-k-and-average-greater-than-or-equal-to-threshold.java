class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
       int count=0;
       int sum=0;
       for(int i=0;i<k;i++){
            sum+=arr[i];
       } 
       if(sum/k>=threshold){
        count++;
       }
       int i=0;
       int j=k;
       while(j<arr.length){
        sum=sum-arr[i]+arr[j];
        if(sum/k>=threshold){
            count++;
        }
        i++;
        j++;
       }
       return count;
    }
}