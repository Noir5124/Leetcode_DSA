class Solution {
    public boolean isSubsequence(String s, String t) {
        int counter=0;
        for(int i=0; i<t.length(); i++){
            if(s.length()>t.length()) return false;
            if(counter==s.length()) return true;
            if(t.charAt(i)==s.charAt(counter)) {
                counter++;
            }
        }
        return (counter==s.length())? true : false;
    }
}