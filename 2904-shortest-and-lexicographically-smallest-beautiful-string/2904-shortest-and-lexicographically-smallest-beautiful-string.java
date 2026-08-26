class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int count=0;
        int left=0;
        int ans=Integer.MAX_VALUE;
        String str="";
        for(int right=0;right<s.length();right++){
            if(s.charAt(right)=='1'){
                count++;
            }

            while(count==k){
                if(s.charAt(left)=='0'){
                    left++;
                }else{
                    String curr=s.substring(left,right+1);
                    if(right-left+1<ans || (right-left+1== ans && curr.compareTo(str) < 0)){
                        ans=right-left+1;
                        str=curr;
                    }
                    count--;
                    left++;
                }
            }
        }
        return str;
    }
}