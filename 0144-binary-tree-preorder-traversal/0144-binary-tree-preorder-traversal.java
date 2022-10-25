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

/* Using RECURSION */
class Solution {
    
    public void traverse (TreeNode root, ArrayList<Integer> preorderList){
        if(root == null)
            return;
        
        preorderList.add(root.val);
        traverse(root.left, preorderList);
        traverse(root.right, preorderList);        
    }
    
    
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> preorderList = new ArrayList<>();
        
        traverse(root, preorderList);
        return preorderList;
    }
}




/* Using ITERATION */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> preorderList = new ArrayList<>();
        
        if(root == null) //if tree is empty return empty list
            return preorderList;
        
        Stack<TreeNode> stk = new Stack<>();
        stk.push(root); //push the root node to stack
        
        while(!stk.isEmpty()){
            TreeNode node = stk.pop();  //pop every element from sstack
            preorderList.add(node.val); //and push it into list
            
            if(node.right != null) //if popped node has right node, push in stack
                stk.push(node.right);
            if(node.left != null) //if popped node has left node, push in stack
                stk.push(node.left);
             
        }
        
        return preorderList;
    }
}
