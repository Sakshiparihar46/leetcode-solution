class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int i=0;
        int j=1;
        while(i<arr.length && count!=k){
            if(arr[i]!=j){
                count++;
            }else{
                i++;
            }
            j++;
        }
        if(count!=k){
            return j+(k-count-1);
        }
        return j-1;
    }
}