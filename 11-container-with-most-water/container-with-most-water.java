class Solution {
    public int maxArea(int[] height) {
        int l=0; int r=height.length-1;
        int Lmax = height[l]; int Rmax = height[r];
        int maxCap = 0;
        while(l<r){
            if(Lmax<Rmax){
                int waterCap = Lmax*(r-l);
                maxCap = waterCap>maxCap? Lmax*(r-l): maxCap;
                l++;
                Lmax = Math.max(Lmax,height[l]);
                
            }
            else if(Rmax<=Lmax){
                int waterCap = Rmax*(r-l);
                maxCap = waterCap>maxCap? Rmax*(r-l): maxCap;
                r--;
                Rmax = Math.max(Rmax,height[r]);
                
            }
        }
        return maxCap;
    }
}