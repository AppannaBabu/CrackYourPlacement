// problem link: https://leetcode.com/problems/container-with-most-water/
class Solution {
    public int maxArea(int[] height) {
        int ma=0,f=0,l=height.length-1;
        while(f<l){
            if(height[f]<height[l]){
                ma=Math.max(ma,height[f]*(l-f));
                f++;
            }
            else{
                ma=Math.max(ma,height[l]*(l-f));
                l--;
            }
        }
        return ma;
    }
}