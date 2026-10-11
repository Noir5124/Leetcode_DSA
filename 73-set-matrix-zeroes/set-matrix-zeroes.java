class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> iIdx = new HashSet<>();
        Set<Integer> jIdx = new HashSet<>();
        int n = matrix.length;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    iIdx.add(i);
                    jIdx.add(j);
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(iIdx.contains(i) || jIdx.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}