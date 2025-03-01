class Solution {
    public int maxProfit(int[] prices) {
        // Buy the stock every day, then sell if i+1
        // is greater than i.
      
        int maxProfit = 0;
        if(prices.length == 1) return 0;
      
        for(int i = 0; i < prices.length-1; i++){
            if(prices[i+1] - prices[i] > 0){
                maxProfit += prices[i+1] - prices[i];
            }
        }
        return maxProfit;
    }
}
