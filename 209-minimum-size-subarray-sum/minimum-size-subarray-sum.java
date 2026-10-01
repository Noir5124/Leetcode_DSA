class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0; 
        int sum = 0;
        int winSize = Integer.MAX_VALUE;
        
        for(int r = 0; r<nums.length; r++){
            sum += nums[r];

            while(sum>=target){
                winSize = Math.min(winSize, r+1-l);
                sum-=nums[l];
                l++;
            }
        }
        return winSize == Integer.MAX_VALUE ? 0 : winSize;
    }
}