# LeetCode problem link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        buy=0
        sell=1
        profit=0
        l=len(prices)
        while sell<l:
            c_profit=prices[sell]-prices[buy]
            if prices[sell]>prices[buy]:
                if c_profit>profit:
                    profit=c_profit+0
            else:
                buy=sell
            sell+=1
        return profit