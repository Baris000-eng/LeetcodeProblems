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

/*Given the root of a Binary Search Tree (BST), return the minimum absolute 
difference between the values of any two different nodes in the tree.*/
  
class Solution {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> binaryTreeValues = inorderTraversal(root);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0 ; i < binaryTreeValues.size(); i++) {
            for(int j = i + 1; j < binaryTreeValues.size(); j++) {
                if(Math.abs(binaryTreeValues.get(i) - binaryTreeValues.get(j)) <= minDiff) {
                    minDiff = Math.abs(binaryTreeValues.get(i) - binaryTreeValues.get(j));
                }
            }
        }

        return minDiff;
        
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> binaryTreeValues = new ArrayList<Integer>();
        if(root == null) {
            return binaryTreeValues;
        }
        binaryTreeValues.addAll(inorderTraversal(root.left));
        binaryTreeValues.add(root.val);
        binaryTreeValues.addAll(inorderTraversal(root.right));
        return binaryTreeValues;
    }
}
