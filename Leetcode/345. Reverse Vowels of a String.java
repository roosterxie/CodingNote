//vowel a e i o u
public class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length() == 1)
            return s;
        int start = 0;
        int end = s.length()-1;
        char[] res = s.toCharArray();
        while(start < end){
            if(!isVowel(s.charAt(start))){
                start++;
                continue;
            }
            if(!isVowel(s.charAt(end))){
                end--;
                continue;
            }
            
            char temp = s.charAt(start);
            res[start] = s.charAt(end);
            res[end] = temp;
            start++;
            end--;
        }
        return new String(res);
    }
    
    private Boolean isVowel(char c){
        switch(c){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'O':    
            case 'o':
            case 'u':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}

#comment:
#4 s.length  应为 s.length()
#39 u -> U