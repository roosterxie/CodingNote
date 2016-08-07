public class Solution {
    public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
        if(numRows < 1)
        	return res;
       	List<Integer> prev = new ArrayList<>();
       	List<Integer> cur = null;
       	prev.add(1);
       	res.add(prev);
       	for(int i = 1; i < numRows;i++){
       		cur = new ArrayList<>();
       		cur.add(1);
       		for(int j = 1; j < prev.size();j++){
       			cur.add(prev.get(j) + prev.get(j-1));
       		}
       		cur.add(1);
       		res.add(cur);
       		prev = cur;
       		cur = null;
       	}
       	return res;
    }
}