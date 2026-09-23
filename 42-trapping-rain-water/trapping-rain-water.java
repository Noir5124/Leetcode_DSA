class Solution {
    public int trap(int[] height) {
        int l = 0; int r = height.length-1;
        int Lmax = height[l]; int Rmax = height[r];
        int res = 0;

        while(l<r){
            if(Lmax<Rmax){
                l+=1;
                Lmax = Math.max(Lmax,height[l]);
                res += Lmax - height[l];
            }
            else{
                r-=1;
                Rmax = Math.max(Rmax,height[r]);
                res += Rmax - height[r];
            }
        }
        return res;
    }
}