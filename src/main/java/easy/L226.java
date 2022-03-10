package easy;

import tree.TreeNode;

/**
 * Given the root of a binary tree, invert the tree, and return its root
 */
public class L226 {

    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }

    private TreeNode invert(TreeNode node) {
        if (node == null) return node;

        TreeNode temp = node.left;
        node.left = invert(node.right);
        node.right = invert(temp);

        return node;
    }
}
