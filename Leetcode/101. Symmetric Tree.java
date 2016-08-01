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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        if(root.left==null && root.right == null)
            return true;
        if(root.left == null || root.right == null)
            return false;
        
        Queue<TreeNode> outer = new LinkedList<>();
        Queue<TreeNode> inner = new LinkedList<>();
        outer.add(root.right);
        inner.add(root.left);
        while(!outer.isEmpty() && !inner.isEmpty()){
            TreeNode left = inner.remove();
            TreeNode right = outer.remove();
            
            if(left.val != right.val)
                return false;
            if(left.left == null && right.right!=null || left.left != null && right.right==null)
                return false;
            if(left.right == null && right.left!=null || left.right != null && right.left==null)
                return false;
            if(left.left!=null && right.right!=null){
                inner.add(left.left);
                outer.add(right.right);
            }
            if(left.right!=null && right.left!=null){
                inner.add(left.right);
                outer.add(right.left);
            }
        }
        return true;
    }
}

#comment
（1）左边为空而右边不为空；（2）左边不为空而右边为空；（3）左边值不等于右边值。根据这几个条件在遍历时进行判断即可。算法的时间复杂度是树的遍历O(n)，空间复杂度同样与树遍历相同是O(logn)。

非递归方法比起递归方法要繁琐一些，因为递归可以根据当前状态（比如两个都为空）直接放回true，而非递归则需要对false的情况一一判断，不能如递归那样简练。
//bfs #29 


public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return helper(root.left,root.right);
    }
    
    private boolean helper(TreeNode left, TreeNode right){
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        if(left.val != right.val)
            return false;
        return helper(left.left,right.right) && helper(left.right,right.left);
    }
}

#comment
dfs