class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length / 2;
        int L = 0;
        int count = 1;
        
        for(int R = 1; R<nums.length; R++){
            if(nums[L]!=nums[R]){
                L = R;
                count = 1;
            }
            else if(nums[L]==nums[R]){
                L++;
                count++;
            }
            
            if(count>n) return nums[L];
        }
        return nums[0];
    }
}