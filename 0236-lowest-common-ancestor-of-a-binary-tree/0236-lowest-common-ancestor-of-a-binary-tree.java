/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
        if(root==null || root==n1 || root==n2)
            return root;
        
        TreeNode leftNode = lowestCommonAncestor(root.left, n1, n2);
        TreeNode rightNode = lowestCommonAncestor(root.right, n1, n2);
        
        if(leftNode == null)
            return rightNode;
        
        else if(rightNode == null)
            return leftNode;
        else
            return root;
    }
}