// problem link: https://leetcode.com/problems/4sum/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        int n=nums.length;
        if(n<=3){
            return res;
        }
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int l=j+1,r=n-1,t=target-nums[i]-nums[j];
                while(l<r){
                    if(nums[l]+nums[r]>t){
                    r--;
                    }
                    else if(nums[l]+nums[r]<t){
                        l++;
                    }
                    else{
                        res.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
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
                while(j<n-2 && nums[j]==nums[j+1]){
                    j++;
                }
            }
            while(i<n-3 && nums[i]==nums[i+1]){
                i++;
            }
        }
        return res;
    }
}