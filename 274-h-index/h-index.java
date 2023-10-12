class Solution {
    public int hIndex(int[] citations) {
        int len=citations.length,res=0;
        int[] dp=new int[len+1];
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            for(int j:citations)
            {
                if(j>=i)
                {
                    dp[i]+=1;
                }
            }
            if(dp[i]>=i){
                res=i;
            }
        }
        return res;

    }

}