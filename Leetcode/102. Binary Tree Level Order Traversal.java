/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
        	return res;

        int prevNum = 1;
        int curNum = 0;
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
        	if(level >= res.size())
        		res.add(New ArrayList<>());

        	TreeNode cur = queue.pop();

        	res.get(level).add(cur.val);
        	
        	if(cur.left!=null){
        		queue.add(cur.left);
        		curNum++;
        	}
        	
        	if(cur.right!=null){
        		queue.add(cur.right);
        		curNum++;
        	}

        	prevNum--;
        	if(prevNum==0){
        		prevNum = curNum;
        		level++;
        		curNum = 0;
        	}
        }
        return res;
    }
}