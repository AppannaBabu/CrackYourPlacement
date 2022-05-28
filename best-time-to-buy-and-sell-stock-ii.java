// problem link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii
class Solution {
    public int maxProfit(int[] prices) {
        int buy=0,sell=0,profit=0;
        while(sell<prices.length-1){
            if(prices[sell]>prices[sell+1]){
                if (prices[sell]>prices[buy])
                    profit+=(prices[sell]-prices[buy]);
                buy=sell+1;
            }
            else if(sell==prices.length-2 && prices[sell+1]>prices[buy])
                profit+=(prices[sell+1]-prices[buy]);
            sell+=1;
        }
        return(profit);
    }
}