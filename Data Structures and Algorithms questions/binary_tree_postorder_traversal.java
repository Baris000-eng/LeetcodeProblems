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

/*Given the root of a binary tree, return the postorder traversal of its nodes' values.*/

class Solution {
     public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        if (root == null) {
            return lst;
        }
        
        lst.addAll(postorderTraversal(root.left));
        lst.addAll(postorderTraversal(root.right));
        lst.add(root.val);
        
        return lst;
    }
}
