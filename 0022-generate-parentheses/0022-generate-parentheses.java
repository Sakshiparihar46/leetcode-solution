class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        ishelper(n,0,0,new StringBuilder(),ans);
        return ans;
    }
    private void ishelper(int n,int open,int close,StringBuilder str,List<String> ans){
        if(str.length()==n*2){
            ans.add(str.toString());
            return ;
        }

        if(open<n){
            str.append("(");
            ishelper(n,open+1,close,str,ans);
            str.deleteCharAt(str.length()-1);
        }
        if(close<open){
            str.append(")");
            ishelper(n,open,close+1,str,ans);
            str.deleteCharAt(str.length()-1);
        }
    }

}