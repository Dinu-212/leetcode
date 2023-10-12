class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        int n=nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    static void reverse(int[] nums,int start,int end){
        while(start<end){
            nums[start]=nums[start]+nums[end];
            nums[end]=nums[start]-nums[end];
            nums[start]=nums[start]-nums[end];
            start++;end--;
        }
    }
}