class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count = 1, parity = 0;
        if(n!=0){
            for(int i=0, k=0; i<n; i++){
                if(i!=k && nums[k]==nums[i]) 
                    parity++;
                else if(nums[i]!=nums[k] && parity!=0){
                    nums[k+1] = nums[i];
                    if(parity>1) parity--;
                    k++;  
                    count++;
                }
                else if(nums[i]!=nums[k]){
                    count++;
                    k++;
                }
            }
            return count;
        }
        return 0;
    }
}