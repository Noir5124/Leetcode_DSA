class Solution {
    public boolean isPalindrome(String s) {
       int left = 0; int right = s.length()-1;

       while(left<right){
            if(!isAlnum(s.charAt(left))){left++;continue;}
            if(!isAlnum(s.charAt(right))){right--;continue;}
            if(toLower(s.charAt(left)) != toLower(s.charAt(right))) return false;
            left++;
            right--;
       }

       return true;

    }

    private boolean isAlnum(Character c){
        return (c >= 'a' && c <= 'z') || (c>='A' && c<='Z') || (c>='0' && c<='9');
    }

    private Character toLower(Character c){
        return (c >= 'A' && c <= 'Z') ? (char) (c+32) : c;
    }
}