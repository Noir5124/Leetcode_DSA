class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> idx = new HashMap<>();
        int max = 0;
        int count = 0;
        int i = 0;
        while(i<s.length()){
            if(!idx.containsKey(s.charAt(i))){
                idx.put(s.charAt(i),i);
                count++;
                i++;
                max = Math.max(max,count);
                continue;
            }
            count = 0;
            i = idx.get(s.charAt(i))+1;
            idx.clear();

        }
        return max;
    }
}