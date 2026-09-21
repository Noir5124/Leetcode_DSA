class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length-1;
        int Lmax = height[l], Rmax = height[r];
        int result = 0;

        while(l<r){
            if(Lmax<Rmax){
                l+=1;
                Lmax = Math.max(Lmax,height[l]);
                result += Lmax - height[l];
            }
            else{
                r-=1;
                Rmax = Math.max(Rmax,height[r]);
                result += Rmax - height[r];
            }
        }
        return result;
        
    }
}