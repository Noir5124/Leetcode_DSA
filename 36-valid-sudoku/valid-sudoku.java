class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for(int i = 0; i < 9; i++){
            for(int j=0; j<9; j++){
                char num = board[i][j];
                    
                if(num == '.') continue;

                int boxIndex = (i/3)*3 + (j/3);

                String rowKey = num + "in row" + i;
                String colKey = num + "in col" + j;
                String boxKey = num + "in box" + boxIndex;
                
                if(seen.contains(rowKey) || seen.contains(colKey) || seen.contains(boxKey)){
                    return false;
                }

                seen.add(rowKey);
                seen.add(colKey);
                seen.add(boxKey);
            }
        }
        return true;
    }
}