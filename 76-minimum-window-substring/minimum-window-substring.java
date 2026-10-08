class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }

        String ans = "";
        HashMap<Character, Integer> need = new HashMap<>();
        int winSize = Integer.MAX_VALUE;
        int start = 0;
        int count = 0;

        for(Character ch : t.toCharArray()){
            need.put(ch, need.getOrDefault(ch,0)+1);
        }

        HashMap<Character, Integer> currCount = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(need.containsKey(ch)){
                currCount.put(ch,currCount.getOrDefault(ch,0)+1);
                
                if(currCount.get(ch)<=need.get(ch)){
                    count++;
                }

                while(count==t.length()){
                    if(i-start+1<winSize){
                        winSize = i-start+1;
                        ans = s.substring(start,i+1);
                    }
                    char startCh = s.charAt(start);
                    if(need.containsKey(startCh)){
                        currCount.put(startCh,currCount.get(startCh)-1);

                        if(currCount.get(startCh)<need.get(startCh)){
                            count--;
                        }
                    }
                    start++;
                }
            }
        }
        return ans;
    }
}