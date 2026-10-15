class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!s.isEmpty() && nums2[i]>s.peek()){
                map.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                nums1[i]=map.get(nums1[i]);
                }
            else{
                nums1[i]=-1;
            }
        }
        return nums1;
    }
}