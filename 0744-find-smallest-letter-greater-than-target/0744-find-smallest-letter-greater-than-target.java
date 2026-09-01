class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int ch=Integer.MAX_VALUE;
        for(int i=0;i<letters.length;i++){
            if(target<letters[i]){
                ch=Math.min(ch,(int)letters[i]);
            }
        }
        return ch==Integer.MAX_VALUE?letters[0]:(char)ch;
    }
}