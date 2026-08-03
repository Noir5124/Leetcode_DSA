class Solution {
    public int removeDuplicates(int[] nums) {
        int k = Math.min(2,nums.length);
        for(int i=2; i<nums.length; i++){
            if(nums[k-2]!=nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}