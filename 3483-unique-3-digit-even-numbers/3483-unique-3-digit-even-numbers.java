class Solution {
    public int ans=0;
    public void helper(int[] digits,int len,boolean vis[],int number){
        if(len==3){
            if(number%2==0){
                ans++;
            }
            return;
        }
        for(int i=0;i<digits.length;i++){
            if(i>0 && digits[i]==digits[i-1] && !vis[i-1]){
                continue;
            }
            if(vis[i]){
                continue;
            }
            if(len==0 && digits[i]==0){
                continue;
            }
            if(!vis[i]){
                vis[i]=true;
                helper(digits,len+1,vis,number*10+digits[i]);
                vis[i]=false;  
            }
        }
    }
    public int totalNumbers(int[] digits) {
        Arrays.sort(digits);
        helper(digits,0,new boolean[digits.length],0);
        return ans;
    }
}