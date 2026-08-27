class Solution {
    public int search(int[] nums, int target) {
        int minimum=Integer.MAX_VALUE;
        int min_index=0;
        for(int i=0;i<nums.length;i++){
           if(minimum>nums[i]){
            minimum=nums[i];
            min_index=i;
           }
        }
        int l = 0;
        int r = 0;
        if (target >= nums[min_index] && target <= nums[nums.length - 1]) {
            l = min_index;
            r = nums.length - 1;
        } else {
            l = 0;
            r = min_index;
        }

        while (l <= r) {
            int mid =l+(r-l)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}