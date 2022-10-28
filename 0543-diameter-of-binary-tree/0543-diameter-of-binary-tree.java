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
    
    public int calcDiameter(TreeNode root, int diameter[]) {
        if (root == null) {
            return 0;
        }
        int leftHeight = calcDiameter(root.left, diameter);
        int rightHeight = calcDiameter(root.right, diameter);
        diameter[0] = Math.max(diameter[0], (leftHeight+rightHeight));
        return Math.max(leftHeight,rightHeight)+1;
    }
    
    
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        calcDiameter(root, diameter);
        return diameter[0];        
    }    
}