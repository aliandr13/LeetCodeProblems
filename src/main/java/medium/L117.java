package medium;

import tree.Node;

public class L117 {

    private Node prev;
    private Node mostLeft;

    public Node connect(Node root) {
        if (root == null) return null;
        mostLeft = root;
        while (mostLeft != null) {
            Node curr = mostLeft;
            mostLeft = null;
            prev = null;
            while (curr != null) {
                process(curr.left);
                process(curr.right);
                curr = curr.next;
            }
        }
        return root;
    }

    private void process(Node node) {
        if (node == null) return;
        if (prev != null) {
            prev.next = node;
        } else {
            mostLeft = node;
        }
        prev = node;
    }

/*    public Node connect(Node root) {
        if (root == null) return null;
        Node mostLeft = root;
        while (hasNext(mostLeft)) {
            Node head = mostLeft;
            while (head != null) {
                // connection 1
                if (head.left != null && head.right != null)
                    head.left.next = head.right;
                // connection 2
                if (head.next != null) {
                    Node left = head.right != null ? head.right : head.left;
                    if (left != null) {
                        Node right = getRight(head);
                        left.next = right;
                    }
                }
                head = head.next;
            }
            mostLeft = getNextMostLeft(mostLeft);
        }
        return root;
    }

    private Node getRight(Node head) {
        Node current = head;
        while (current.next != null){
            Node candidate = current.next.left != null ? current.next.left : current.next.right;
            if (candidate != null) return candidate;
            current = current.next;
        }
        return null;
    }

    private boolean hasNext(Node node) {
        return node.left != null || node.right != null || node.next != null;
    }

    private Node getNextMostLeft(Node node) {
        if (node.left != null) return node.left;
        if (node.right != null) return node.right;
        return node.next;
    }*/

}
