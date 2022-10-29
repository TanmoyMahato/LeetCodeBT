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
    
    public int getDiameter(TreeNode root, int diameter[]){
        if(root == null)
            return 0;
        
        int leftHeight = getDiameter(root.left, diameter);
        int rightHeight = getDiameter(root.right, diameter);
        
        diameter[0] = Math.max(diameter[0],leftHeight+rightHeight);
        
        return Math.max(leftHeight,rightHeight)+1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        
        int diameter[] = new int[]{Integer.MIN_VALUE};
        getDiameter(root, diameter);
        
        return diameter[0];
    }
}