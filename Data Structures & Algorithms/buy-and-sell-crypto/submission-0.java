class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max_value = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            int profit = prices[i] - min;
            if(profit > max_value){
                max_value = profit;
            }
        }
        return max_value;
    }
}
