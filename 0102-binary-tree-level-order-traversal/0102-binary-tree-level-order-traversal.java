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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        ArrayList<List<Integer>> levelorderList = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();  //queue to store node at same level
        
        //if tree is empty
        if(root == null)
            return levelorderList;

        //queue must always store root in beginning
        q.add(root);  
        while(!q.isEmpty()){
            //sub ArrayList to store values of same level
            ArrayList<Integer> subList = new ArrayList<>();
            //store size of current level
            int levelsize = q.size();
            for(int i=0; i<levelsize; i++){
                //remove elements from queue and add to sublist
                TreeNode node = q.remove();
                subList.add(node.val);
                //check if the removed queue has left and right nodes
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
            }
            //add the values of same levels as subList to another levelorderList
            levelorderList.add(subList);
        }
        
        return levelorderList;
    }
}