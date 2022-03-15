package tree;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node(int val) {
        this.val = val;
    }

    public static Node of(int val) {
        return new Node(val);
    }

    public Node withLeft(int val) {
        this.left = Node.of(val);
        return this;
    }

    public Node withRight(int val) {
        this.right = Node.of(val);
        return this;
    }

    @Override
    public String toString() {
        return "Val=" + val +
                " Left=" + (left == null ? "null" : left.val) +
                " Right=" + (right == null ? "null" : right.val) +
                " Next=" + (next == null ? " null" : next.val);
    }
}
