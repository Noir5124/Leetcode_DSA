class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> count = new HashMap<>();
        int left = 0;
        int max = 0; 
        for(int r=0; r<s.length(); r++){
            Character c = s.charAt(r);
            count.put(c, count.getOrDefault(c,0)+1);

            while(count.get(c)>1){
                count.put(s.charAt(left), count.get(s.charAt(left))-1);
                left++;
            }
            max = Math.max(max,r-left+1);
        }
        return max;
    }
}