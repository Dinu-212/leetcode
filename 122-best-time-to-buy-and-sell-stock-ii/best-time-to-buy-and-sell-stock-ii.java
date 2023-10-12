class Solution {
    public int maxProfit(int[] prices) {
        int[] dp=new int[prices.length+1];
        int res=0;
        dp[0]=0;
        for(int i=1;i<prices.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-1]+prices[i]-prices[i-1]);
        }
        for(int i:dp){
            res=Math.max(res,i);
        }
        return res;
    }
}