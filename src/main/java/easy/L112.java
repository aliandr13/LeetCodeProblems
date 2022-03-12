package easy;

import tree.TreeNode;

/**
 * Given the root of a binary tree and an integer targetSum,
 * return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 */
public class L112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && targetSum == root.val) return true;
        return hasPathSum(root.right, targetSum - root.val) || hasPathSum(root.left, targetSum - root.val);
    }
}
