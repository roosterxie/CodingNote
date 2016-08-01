public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0)
            return 0;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            if(nums[start]!=val){
                start++;
                continue;
            }
            if(nums[end]==val){
                end--;
                continue;
            }
            
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return start;
    }
}


#comment
#17 忘了加int