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
    public int closestValue(TreeNode root, double target) {
       int res = root.val;
       while(root != null){
            if(Math.abs(root.val - target)<Math.abs(res - target)){//compare current value and update return value
                res = root.val;
            }
            
            root = root.val>target?root.left:root.right;
       }
       return res;
    }
}
/*
#comment
处理BST并不一定需要dps,该iterator还是要iterator
 iteration
public int closestValue(TreeNode root, double target) {
    int ret = root.val;   
    while(root != null){
        if(Math.abs(target - root.val) < Math.abs(target - ret)){
            ret = root.val;
        }      
        root = root.val > target? root.left: root.right;
    }     
    return ret;
}

*/