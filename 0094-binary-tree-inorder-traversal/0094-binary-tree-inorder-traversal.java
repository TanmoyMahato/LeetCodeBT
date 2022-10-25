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
    
    public void traverse(TreeNode root, ArrayList<Integer> inorderList){
        if(root == null)
            return;
        traverse(root.left,inorderList);
        inorderList.add(root.val);
        traverse(root.right,inorderList);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> inorderList = new ArrayList<>();
        traverse(root, inorderList);
        return inorderList;
    }
}




/* Using ITERATION */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> inorderList = new ArrayList<>();
        
        if(root == null)
            return inorderList;
        
        Stack<TreeNode> stk = new Stack<>();
        TreeNode node = root; //store the root node 
        
        while(true){
            if(node != null){ //if node is !null push node in stack and move left
                stk.push(node);
                node = node.left;
            }
            else{ //if node is null 
                //check if stack is empty, if empty, tree traversal is finished
                if(stk.isEmpty())
                    break;
                //else if stack is not empty, pop the top node, add its value in list, and move right
                else{ 
                    node = stk.pop();
                    inorderList.add(node.val);
                    node = node.right;
                }                
            }
        }
        
        return inorderList;
    }
}
