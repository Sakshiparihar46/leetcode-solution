class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }
       int l=0;
       int r=nums.length-1;
       //search min index
       while(l<r){
        int mid=l+(r-l)/2;
        if(nums[mid]>nums[r]){
            l=mid+1;
        }else{
            r=mid;
        }
       }
       int min=l;

       //choose the side of the array
       if(target>=nums[min] && target<=nums[nums.length-1]){
        l=min;
        r=nums.length-1;
       } else{
        l=0;
        r=min-1;
       }

       while(l<=r){
        int mid=l+(r-l)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            l=mid+1;
        }else{
            r=mid-1;
        }
       }
       return -1;
    }
}