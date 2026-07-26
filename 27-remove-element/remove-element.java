class Solution {
    public int removeElement(int[] nums, int val) {
        int R = nums.length - 1;
        int L = 0;
        while(L<=R){
            if(nums[L] == val){
                nums[L] = nums[R];
                R--;
            }
            else
                L++;
        }
        return L;
    }
}