class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer>ans=new ArrayList<>();
        if(s.length()<p.length()){
            return ans;
        }
       int []pCount=new int[26];
       for(int i=0;i<p.length();i++){
        pCount[p.charAt(i)-'a']++;
       } 

       int window[]=new int[26];
       for(int i=0;i<p.length();i++){
        char ch=s.charAt(i);
        window[ch-'a']++;
       }
       if(Arrays.equals(pCount,window)){
        ans.add(0);
       }
       int j=p.length();
       int i=0;
       while(j<s.length()){
        char ch=s.charAt(i);
            window[ch-'a']--;
            i++;
        window[s.charAt(j)-'a']++;
        j++;
        if(Arrays.equals(pCount,window)){
            ans.add(i);
        }
       }
       return ans;
    }
}