public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[0],nums[1]);
        int res = 0;//n
        int j = nums[0];//n-2
        int k = Math.max(nums[0],nums[1]);//n-1
        for(int i = 2; i < nums.length;i++){
            res = Math.max(nums[i]+j,k);
            j = k;
            k = res;
        }
        return res;
    }
}