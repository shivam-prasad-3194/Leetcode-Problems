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
    // perform level order traversal and find the sum of all nodes of each level and find maxSum and their level 
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int maxSum = root.val;  // it stores the max sum a level
        int level = 1;   // it stores the level of max sum
        int currLevel = 1;  // it is the current level 
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();  
            int currSum = 0;
            for(int i = 0; i < size; i++){
                TreeNode curr = q.remove();
                currSum += curr.val;
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            if(currSum > maxSum){
                maxSum = currSum;
                level = currLevel;
            }
            currLevel++;
        }
        return level;
    }
}