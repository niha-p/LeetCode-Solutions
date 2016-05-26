/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/

public class BuySellStock {
    public int maxProfit(int[] prices) {
        
        if(prices==null || prices.length<2)
            return 0;
        int buy=prices[0];
        int max=0;
        
        for (int i=1;i<prices.length; i++)
        {
            if (prices[i]<buy)
                buy=prices[i];
            else
            {
               int prof=prices[i]-buy;
               if (prof>max)
                    max=prof;
            }
        }
        return max;
    }
}