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
    
    ArrayList<Integer> inorderList = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
            return inorderList;
        inorderTraversal(root.left);
        inorderList.add(root.val);
        return inorderTraversal(root.right);
    }
}