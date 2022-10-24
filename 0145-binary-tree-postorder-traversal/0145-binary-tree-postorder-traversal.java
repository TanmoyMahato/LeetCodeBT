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
    
    public void traverse(TreeNode root, ArrayList<Integer> postorderList){
        if(root == null)
            return;
        traverse(root.left,postorderList);
        traverse(root.right,postorderList);
        postorderList.add(root.val);
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> postorderList = new ArrayList<>();
        traverse(root, postorderList);
        return postorderList;
    }
}