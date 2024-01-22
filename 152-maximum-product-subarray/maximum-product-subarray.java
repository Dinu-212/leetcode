class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int left=1,right=1,n=nums.length;
        for(int i=0;i<n;i++){
            left=left!=0?left:1;
            right=right!=0?right:1;
            left*=nums[i];
            right*=nums[n-i-1];
            ans=Math.max(ans,Math.max(left,right));
        }
        return ans;
    }
}