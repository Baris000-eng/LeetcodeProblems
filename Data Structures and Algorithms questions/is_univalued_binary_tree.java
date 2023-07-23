/*A binary tree is uni-valued if every node in the tree has the same value.

Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.*/

import java.util.*;

class Solution {
    public boolean isUnivalTree(TreeNode root) {
        List<Integer> binaryTreeValues = binaryTreeValuesWithInorderTraversal(root);
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < binaryTreeValues.size(); i++) {
            int binaryTreeValue = binaryTreeValues.get(i);
            set.add(binaryTreeValue);
        }

        return set.size() == 1;
    }

    public List<Integer> binaryTreeValuesWithInorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<Integer>();
        if (root == null) {
            return lst;
        }
        lst.addAll(binaryTreeValuesWithInorderTraversal(root.left));
        lst.add(root.val);
        lst.addAll(binaryTreeValuesWithInorderTraversal(root.right));

       
        return lst;
    }
}
