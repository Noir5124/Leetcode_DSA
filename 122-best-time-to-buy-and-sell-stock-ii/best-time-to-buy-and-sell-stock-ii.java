class Solution {
    public int maxProfit(int[] prices) {
        int k = 0;
        int Profit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] <= prices[k]){
                k = i;
            }
            else if(prices[i] > prices[k]){
                Profit +=  prices[i] - prices[k];
                k = i;
            }
        }
        return Profit;
    }
}