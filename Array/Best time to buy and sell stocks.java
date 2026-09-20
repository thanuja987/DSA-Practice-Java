class Solution {
    public int maxProfit(int[] prices) {

        // LeetCode 121 - Best Time to Buy and Sell Stock
        // Approach: Track the minimum buying price seen so far.
        // For each price, calculate the profit by selling on that day.
        // Update maxprofit with the maximum profit found.
        // If the current price is smaller, update buyprice.
        // TC: O(n)
        // SC: O(1)

        int maxprofit = 0;
        int buyprice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[i];
            }
        }

        return maxprofit;
    }
}
