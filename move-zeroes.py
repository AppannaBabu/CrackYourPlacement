# LeetCode problem link: https://leetcode.com/problems/move-zeroes/
class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n=0
        i=0
        l=len(nums)-1
        l1=l+0
        while(i<=l1):
            if nums[i]==0:
                nums.pop(i)
                i-=1
                l1-=1
            i+=1
        nums+=[0]*(l-l1)