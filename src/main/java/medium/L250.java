package medium;

import tree.TreeNode;

/**
 * Given the root of a binary tree, return the number of uni-value subtrees.
 * A uni-value subtree means all nodes of the subtree have the same value.
 */
public class L250 {

    private int counter;

    public int countUnivalSubtrees(TreeNode root) {
        counter = 0;
        if (root == null) return 0;
        isUni(root);
        return counter;
    }

    private boolean isUni(TreeNode node) {
        if (node == null) return false;
        if (node.right == null && node.left == null) {
            counter++;
            return true;
        }
        boolean isUniR = isUni(node.right);
        boolean isUniL = isUni(node.left);
        if (node.left == null && isUniR && node.val == node.right.val) {
            counter++;
            return true;
        }
        if (node.right == null && isUniL && node.val == node.left.val) {
            counter++;
            return true;
        }
        if (isUniL && isUniR && node.left.val == node.val && node.right.val == node.val) {
            counter++;
            return true;
        }
        return false;
    }

}
