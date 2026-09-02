class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int len = prefix.length();
        //smallest element
        for(int i = 1; i<strs.length; i++){
            if(strs[i].length()< len){
                prefix = strs[i];
            }
        }
        
        //Iterate array
        for(int i=0; i<strs.length; i++){
            int count = 0;
            for(int j=0;j<prefix.length();j++){
                if(strs[i].charAt(j)==prefix.charAt(j)) count++;
                else break;
            }
            prefix = prefix.substring(0,count);
        }
        return prefix;

    }
}