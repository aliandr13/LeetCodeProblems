package medium;

import tree.TreeNode;

/**
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 */
public class L236 {

    private TreeNode result = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root.val == p.val || root.val == q.val) return root;
        search(root, p, q);
        return result;
    }

    private boolean search(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null || result != null) return false;
        boolean mid = (node.val == p.val || node.val == q.val);
        boolean left = search(node.left, p, q);
        boolean right = search(node.right, p, q);
        if (left && right || (mid && (left || right))) {
            result = node;
            return true;
        }
        return mid || left || right;
    }
}
