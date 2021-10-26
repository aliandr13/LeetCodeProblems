package easy;

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


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
