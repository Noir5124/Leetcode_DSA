class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()){
            return s;
        }
        
        
        List<Character>[] rows = new ArrayList[numRows];
        for(int i=0; i<numRows; i++){
            rows[i] = new ArrayList<>();
        }

        int idx = 0; int dir = 1;
        for(Character c : s.toCharArray()){
            if(idx == 0) dir = 1;
            else if(idx == numRows-1) dir = -1;
            rows[idx].add(c);
            idx += dir;
        }

        StringBuilder sb = new StringBuilder();

        for(List<Character> row : rows){
            for(Character c : row){
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}