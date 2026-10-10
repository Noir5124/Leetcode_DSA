class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l1 = new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
         // take 4 variables 
         int srow=0,scol=0,erow=m-1,ecol=n-1;
         //traverse through matrix 
         while(srow<=erow && scol<=ecol){
            //top : move for 1st row  we move column  till end n-1
            for(int j=scol;j<=ecol;j++){
                l1.add(matrix[srow][j]);
            }
            srow++;
            //right : move from 2nd row to last row in last col
            for(int i=srow; i<=erow;i++){
              
                l1.add(matrix[i][ecol]);
            }
            ecol--;
            //bottom: move from lastsecond  col to start col 
            if(srow <= erow){
            for(int j=ecol;j>=scol;j--){
                l1.add(matrix[erow][j]);
            }
            erow--;
            }
            
            //left:
            if(scol <= ecol){ 
            for(int i=erow;i>=srow;i--){
                
                l1.add(matrix[i][scol]);

            }
            scol++;
            }
            
         }
        return l1;
    }
}