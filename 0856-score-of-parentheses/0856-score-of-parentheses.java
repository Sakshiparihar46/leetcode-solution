class Solution {
    public int scoreOfParentheses(String s) {
       Stack <Integer> st=new Stack<>();
        st.push(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(0);
            }else{
                int score=0;
                int inside=st.pop();
                if(inside==0){
                    score++;
                }else{
                   score= 2*inside;
                }
                int previous=st.pop();
                st.push(previous+score);
            }
        }
        return st.pop();
    }
}