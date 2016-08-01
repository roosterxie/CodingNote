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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        int lastNum = 1;
        int curNum = 0;
        int level = 0;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode n = queue.remove();
            
            if(res.size()<=level)//initialization for new level
                res.add(new ArrayList<>());
            lastNum--;
            res.get(level).add(n.val);
            if(n.left!=null){
                queue.add(n.left);
                curNum++;
            }
            if(n.right!=null){
                queue.add(n.right);
                curNum++;
            }
            if(lastNum == 0){
                level++;
                lastNum = curNum;
                curNum = 0;
            }
        
        }
        Collections.reverse(res);
        return res;
    }
    
    
}

# 36 forget update level
# 12 initialization Interface