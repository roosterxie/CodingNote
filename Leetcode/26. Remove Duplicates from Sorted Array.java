public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null)
            return 0;
        if(nums.length < 2)
            return nums.length;
        int cur = 0;
        int next = 1;
        while(next < nums.length){
            if(nums[cur] == nums[next]){
                next++;
                continue;
            }
            cur++;
            nums[cur] = nums[next];
            next++;
        }
        return cur+1;
    }
}