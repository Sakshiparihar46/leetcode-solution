class Solution {
    public int maxVowels(String s, int k) {
       int max=0;
       int maxVal=0;
       for(int i=0;i<k;i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            max++;
        }
        maxVal=max;
       } 
        int i=0;
       int j=k;
       while(j<s.length()){
        char ch=s.charAt(i);
        char ch1=s.charAt(j);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            max--;
        }
        if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'){
            max++;
        }
        i++;
        j++;
        maxVal=Math.max(maxVal,max);
       }
       return maxVal;
    }
}