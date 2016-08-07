public class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<Integer,List<String>> map = new HashMap<>();
        for(String string:strings){
        	int sum = 0;
        	int pow = 1;
        	for(int i = 1;i<string.length();i++){
        		int diff = string.charAt(i)-string.charAt(i-1)+1;
        		if(diff < 1)
        			diff+=26;
        		sum+=diff*pow;
        		pow*=26;
        	}
        	Integer key = Integer.valueOf(sum);
        	if(!map.containsKey(key)){
        	    List<String> group = new ArrayList<>();
        	    group.add(string);
        	    map.put(key,group);
        	}else
        	    map.get(key).add(string);
        }
        List<List<String>> res = new ArrayList<>(map.values());
        return res;
    }
}

#Add hash to string