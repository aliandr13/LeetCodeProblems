package medium;

import java.util.LinkedList;
import java.util.Queue;

public class L116 {
    // T=O(N), M=O(N)
    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node current = q.poll();
                if (current.left != null) q.add(current.left);
                if (current.right != null) q.add(current.right);
                if (i != size - 1) current.next = q.peek();
            }
        }
        return root;
    }

    // T=O(N); M=O(1)
    public Node connect2(Node root) {
        if (root == null) return null;
        Node mostLeft = root;
        while (mostLeft.left != null) {
            Node head = mostLeft;
            while (head != null) {
                // connection 1
                head.left.next = head.right;
                //connection 2
                if (head.next != null) {
                    head.right.next = head.next.left;
                }
                head = head.next;
            }
            mostLeft = mostLeft.left;
        }
        return root;
    }

    static class Node {
        int val;
        Node left;
        Node right;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        static Node of(int val) {
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
}
