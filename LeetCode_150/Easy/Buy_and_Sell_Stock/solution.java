// both code blocks are in O(n) runtime, but the 1st block is optimal.

// Newer, faster, and better solution
class Solution {
    public int maxProfit(int[] prices) {
    int min = Integer.MAX_VALUE;
    int max = 0;
    for(int p : prices) {
        min = Math.min(min, p);
        max = Math.max(p-min, max);
    }
    return max;
  }
}

// Old, inefficient solution
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1 || prices.length == 0) return 0;

        int max = prices[prices.length-1];
        int min = prices[prices.length-2];
        int maxKey = prices.length-1;
        int minKey = prices.length-2;
        int maxDiff = 0;
        int profit = 0;             
        
        for(int i = prices.length-2; i >= 0; i--){
            if(max - prices[i] > maxDiff){
                maxDiff = max - prices[i];
                min = prices[i];
                minKey = i;
            }
            if(prices[i] > max){
                max = prices[i];
                maxKey = i;
            }
            if(max-min > profit && maxKey > minKey){
                profit = max-min;
            }
        }
        return profit;
    }
}
