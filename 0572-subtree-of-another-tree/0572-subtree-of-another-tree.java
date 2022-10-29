/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public boolean isIdentical(TreeNode node, TreeNode subroot){
        //both nodes are null
        if(node==null && subroot==null)
            return true;
        
        //false conditions
        else if((node==null && subroot!=null) || (node!=null && subroot==null) || (node.val!=subroot.val))
            return false;                
        
        //if(node.val==subtree.val) {check for left and right nodes}
        return isIdentical(node.left, subroot.left) && isIdentical(node.right, subroot.right);
    }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null)
            return false;
        
        if(root.val == subRoot.val){
            boolean isTrue = isIdentical(root, subRoot);
            if(isTrue) 
                return true;
        }
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}