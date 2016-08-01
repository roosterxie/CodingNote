public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num < 1)
            return false;
        double res = Math.log(num)/Math.log(4);
        return res == (int)res;
    }
}