class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minBuy=Integer.MAX_VALUE;
        for(int Price:prices){
            minBuy=Math.min(Price,minBuy);
            maxProfit=Math.max(Price-minBuy,maxProfit);
        }return maxProfit;
    }
}