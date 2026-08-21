class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer>ans=new ArrayList<>();
        if(s.length()<p.length()){
            return ans;
        }
       HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0;i<p.length();i++){
        map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
       } 

       HashMap<Character,Integer> map1=new HashMap<>();
       for(int i=0;i<p.length();i++){
        map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
       }
       if(map.equals(map1)){
        ans.add(0);
       }
       int j=p.length();
       int i=0;
       while(j<s.length()){
        if(map1.get(s.charAt(i))==1){
            map1.remove(s.charAt(i));
            i++;
        }else{
            map1.put(s.charAt(i),map1.get(s.charAt(i))-1);
            i++;
        }
        map1.put(s.charAt(j),map1.getOrDefault(s.charAt(j),0)+1);
        j++;
        if(map.equals(map1)){
            ans.add(i);
        }
       }
       return ans;
    }
}