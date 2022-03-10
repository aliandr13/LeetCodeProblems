package easy;

import tree.TreeNode;

public final class TreeNodeUtils {

    public static TreeNode getBST() {
        TreeNode tree = TreeNode.of(4);
        tree.left = TreeNode.of(2).withLeft(TreeNode.of(1)).withRight(TreeNode.of(3));
        tree.right = TreeNode.of(5).withRight(TreeNode.of(6));
        return tree;
    }
}
