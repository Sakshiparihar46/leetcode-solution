class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int k=2;
        while(k<nums.length){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                arr1.add(nums[k++]);
            }else{
                arr2.add(nums[k++]);
            }
        }

        int ans[]=new int [nums.length];
        int indx=0;
        for(int x:arr1){
            ans[indx++]=x;
        }
        for(int x:arr2){
            ans[indx++]=x;
        }
        return ans;
    }
}