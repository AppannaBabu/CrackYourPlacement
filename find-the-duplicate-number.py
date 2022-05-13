# LeetCode problem link: https://leetcode.com/problems/find-the-duplicate-number/
class Solution(object):
    def findDuplicate(self, nums):
        l=len(nums)
        d={}
        for i in nums:
            d[i]=0
        for j in nums:
            d[j]+=1
            if d[j]>1:
                return j   