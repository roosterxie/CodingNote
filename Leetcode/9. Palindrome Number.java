public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int divider = 1;

        while(x/divider>9){
            divider*=10;
        }
        
        while(x>0){
            int last = x%10;
            int first = (x-x%divider)/divider;
            if(first != last)
                return false;
            x = x%divider/10;
            divider /=100;
        }
        return true;
    }
}