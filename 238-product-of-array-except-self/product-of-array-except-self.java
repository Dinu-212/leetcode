class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0) ans[i]=nums[i];
            else ans[i]=ans[i-1]*nums[i];
        }
        int product=1;
        for(int i=nums.length-1;i>=0;i--){
            if(i==0) ans[i]=product;
            else ans[i]=ans[i-1]*product;
            product*=nums[i];
        }
        return ans;
    }
}