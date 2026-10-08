class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        HashMap<String, Integer> orgCount = new HashMap<>();
        
        if(words.length == 0 || s.length() == 0) return ans;

        for(String word:words){
            orgCount.put(word, orgCount.getOrDefault(word,0)+1);
        }

        int wordLen = words[0].length();
        int wordSize = words.length;
        int N = s.length();

        for(int offset = 0; offset < wordLen; offset++){
            int start = offset;
            HashMap<String, Integer> currCount = new HashMap<>();
            int count = 0;
            
            for(int end = offset; end + wordLen <= N; end += wordLen ){
                String currWord = s.substring(end, end+wordLen);
                if(orgCount.containsKey(currWord)){
                    currCount.put(currWord, currCount.getOrDefault(currWord,0)+1);
                    count++;

                    while(currCount.get(currWord)>orgCount.get(currWord)){
                        String startWord = s.substring(start,start+wordLen);
                        currCount.put(startWord, currCount.get(startWord)-1);
                        count--;
                        start += wordLen;
                    }

                    if(count==wordSize){
                        ans.add(start);
                    }
                }

                else{
                    count=0;
                    start = end + wordLen;
                    currCount.clear();
                }
            }
        }

        return ans;
    }
}