class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0],n=nums.length;
        for(int i=1;i<n;i++){
            nums[i]=Math.max(nums[i],nums[i]+nums[i-1]);
            res=Math.max(res,nums[i]);
        }
        return res;
    }
}