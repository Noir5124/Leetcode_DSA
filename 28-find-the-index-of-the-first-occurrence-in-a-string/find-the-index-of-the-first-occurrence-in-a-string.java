class Solution {
    public int strStr(String haystack, String needle) {
        int hayL = haystack.length(); 
        int needL = needle.length(); 

        if(hayL<needL){
            return -1;
        }

        for(int i=0; i<=hayL-needL; i++){
            int j = 0;
            while(j<needL && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
            }
            if(j==needL) return i;
        }

        return -1;
    }
}