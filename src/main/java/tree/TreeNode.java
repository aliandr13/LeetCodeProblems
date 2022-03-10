package tree;

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

    public TreeNode withRight(TreeNode right) {
        this.right = right;
        return this;
    }

    public static TreeNode of(int val) {
        return new TreeNode(val);
    }

    @Override
    public String toString() {
        return (left == null ? "null" : left.val) + " <- " + val + " -> " + (right == null ? "null" : right.val);
    }
}
