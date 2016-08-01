public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0)
            return null;
       
        int carry = 1;
        for(int i = digits.length-1; i>=0;i--){
            int count = (digits[i]+carry)%10;
            carry = (digits[i]+carry)/10;
            digits[i] = count;
            if(carry == 0)
                return digits;
            
        }
        int[] res = new int[digits.length+1];
        res[0] = 1;
        return res;
        
    }
}

/*
public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0)
            return null;
        int count = 0;
        int carry = 1;
        for(int i = digits.length-1; i>=0;i--){
            count = digits[i]+carry;
            if(count >9){
                carry = 1;
                digits[i]=0;
            }else{
                digits[i] = count;
                return digits;
            }
        }
        int[] res = new int[digits.length+1];
        res[0] = 1;
        return res;
        
    }
}
*/