class Solution {
    public int maxProfit(int[] prices) {

        int[] dp = new int[prices.length];

        int profit = prices[0];
        dp[0] = 0;
        for(int i = 1; i < prices.length;i++){
            profit = Math.min(profit,prices[i]);
            dp[i] = Math.max(dp[i - 1],prices[i] - profit);
        }
        return dp[prices.length - 1];
    }
}
