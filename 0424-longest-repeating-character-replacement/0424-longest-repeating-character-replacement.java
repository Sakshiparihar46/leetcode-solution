class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        int maxfreq=0;
        int windowSize=0;
        int ans=0;
        int freq[]=new int[26];
        while(right<s.length()){
            int indx=s.charAt(right)-'A';
            freq[indx]++;
            maxfreq=Math.max(maxfreq,freq[indx]);
            windowSize=right-left+1;
            if(windowSize-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            windowSize=right-left+1;
            ans=Math.max(ans,windowSize);
            right++;
        }
        return ans;
    }
}