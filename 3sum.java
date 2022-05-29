// problem link: https://leetcode.com/problems/3sum/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length<=2){
            return res;
        }
        for(int i=0;i<nums.length-2;i++){
            int l=i+1,r=nums.length-1,t=-nums[i];
            while(l<r){
                if(nums[l]+nums[r]>t){
                    r--;
                }
                else if(nums[l]+nums[r]<t){
                    l++;
                }
                else{
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r && nums[l]==nums[l+1]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }
            }
            while(i<nums.length-2 && nums[i]==nums[i+1]){
                i++;
            }
        }
        return res;
    }
}