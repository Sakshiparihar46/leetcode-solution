class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }
        int[]arr1=new int[26];
        int[]arr2=new int [26];

        for(int i=0;i<s1.length();i++){
            int indx=s1.charAt(i)-'a';
            arr1[indx]++;
        }

        for(int i=0;i<s1.length();i++){
            int indx=s2.charAt(i)-'a';
            arr2[indx]++;
        }

        if(Arrays.equals(arr1, arr2)){
            return true;
        }
        int i=0;
        int j=s1.length();
        while(j<s2.length()){
            int indx=s2.charAt(i)-'a';
            arr2[indx]--;
            i++;
            arr2[s2.charAt(j)-'a']++;
            j++;
            if(Arrays.equals(arr1,arr2)){
                return true;
            }
        }
        return false;
    }
}