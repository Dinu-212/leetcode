class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length<3){
            return -1;
        }
        int res=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(res>Math.abs(nums[i]+nums[j]+nums[k]-target)){
                        res=Math.abs(nums[i]+nums[j]+nums[k]-target);
                        ans=nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }
        return ans;
    }
}