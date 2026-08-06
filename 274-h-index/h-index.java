
class Solution {
    public int hIndex(int[] citations) {
        int length = citations.length;
        Arrays.sort(citations);
        int hIndex = 0;

        for(int i=0; i<length; i++){
            if(citations[i]>=length-i){
                hIndex = Math.max(hIndex, length-i);
            } 
        }
        return hIndex;                                                           
    }
}
