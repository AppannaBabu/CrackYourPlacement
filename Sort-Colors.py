# LeetCode problem link: https://leetcode.com/problems/sort-colors/
class Solution:
    def sortColors(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """
        f,l=0,len(nums)-1
        i=0
        while(i<=l):
            if nums[i]==0:
                nums[f],nums[i]=nums[i],nums[f]
                f+=1
                #i-=1
            elif nums[i]==2:
                nums[l],nums[i]=nums[i],nums[l]
                l-=1
                i-=1
            i+=1
            
        