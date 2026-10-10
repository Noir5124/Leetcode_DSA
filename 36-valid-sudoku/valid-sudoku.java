class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rowRay = new boolean[9][9];
        boolean[][] colRay = new boolean[9][9];
        boolean[][] boxRay = new boolean[9][9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){

                if(board[i][j] != '.'){
                    
                    int num = board[i][j] - '1';
                    int boxIndex = (i/3)*3 + (j/3);
                     
                    if(rowRay[i][num] || colRay[j][num] || boxRay[boxIndex][num]){
                        return false;
                    }
                    
                    rowRay[i][num] = true;
                    colRay[j][num] = true;
                    boxRay[boxIndex][num] = true;

                }
            }
        }
        return true;

    }
}