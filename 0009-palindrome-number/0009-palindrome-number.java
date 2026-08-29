class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int num=x;
        if(num<0){
            return false;
        }
        while(num!=0){
         reverse=(num%10)+reverse*10;
            num=num/10;
        }
        
        if(reverse==x){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int x=121;
        Solution Palindrome=new Solution();
        Palindrome.isPalindrome(-121);
    }
}