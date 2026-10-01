class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> lastSeen = new HashMap<>();
        int left = 0;
        int max = 0; 
        for(int right = 0; right<s.length();right++){
            Character c = s.charAt(right);

            if(lastSeen.containsKey(c) && lastSeen.get(c)>= left){
                left = lastSeen.get(c)+1;
            }

            lastSeen.put(s.charAt(right),right);
            max = Math.max(max,right-left+1);

        }
        return max;
    }
}