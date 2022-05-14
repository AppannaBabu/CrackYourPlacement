# LeetCode problem link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        c,i,l=0,1,len(nums)-1
        last_index=0
        while i<=l:
            if nums[c]==nums[i]:
                nums[i]=-1
            else:
                nums[c+1],nums[i]=nums[i],nums[c+1]
                c=c+1
                last_index+=1
            i+=1
        return last_index+1