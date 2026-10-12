class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      int count=0;
      int prefix=0;
      HashMap<Integer,Integer> map=new HashMap<>();
      map.put(0,1);
      for(int i=0;i<nums.length;i++){
        prefix+=nums[i];
        int remainder=((prefix%k)+k)%k;
        if(map.containsKey(remainder)){
            count+=map.get(remainder);
        }
        map.put(remainder,map.getOrDefault(remainder,0)+1);
      }  
      return count;
    }
}