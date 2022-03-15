package tree;

import java.util.Objects;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode withLeft(TreeNode left) {
        this.left = left;
        return this;
    }

    public TreeNode withLeft(int val) {
        this.left = TreeNode.of(val);
        return this;
    }

    public TreeNode withRight(TreeNode right) {
        this.right = right;
        return this;
    }

    public TreeNode withRight(int val) {
        this.right = TreeNode.of(val);
        return this;
    }

    public static TreeNode of(int val) {
        return new TreeNode(val);
    }

    @Override
    public String toString() {
        return (left == null ? "null" : left.val) + " <- " + val + " -> " + (right == null ? "null" : right.val);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode node = (TreeNode) o;
        return val == node.val && Objects.equals(left, node.left) && Objects.equals(right, node.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}
