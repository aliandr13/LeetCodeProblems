package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadsFirstValues<T> {

    //      a
    //     / \
    //    b   c
    //   / \   \
    //  d   e   f
    public List<T> travers(Node<T> root) {
        if (root == null) return List.of();
        List<T> result = new ArrayList<>();
        Queue<Node<T>> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node<T> current = q.poll();
            result.add(current.value);
            if (current.left != null) q.add(current.left);
            if (current.right != null) q.add(current.right);
        }
        return result;
    }

    public boolean includes(Node<T> root, T target) {
        if (root == null) return false;
        Queue<Node<T>> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node<T> current = q.poll();
            if (target.equals(current.value)) return true;
            if (current.left != null) q.add(current.left);
            if (current.right != null) q.add(current.right);
        }
        return false;
    }

    public int treeSum(Node<T> node) {
        if (node == null) return 0;
        Queue<Node<T>> queue = new LinkedList<>();
        int totalSum = 0;
        queue.add(node);
        while (!queue.isEmpty()) {
            Node<T> current = queue.poll();
            totalSum += (Integer) current.value;
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return (totalSum);
    }

    public int treeMinValue(Node<T> node) {
        if (node == null) return 0;
        Queue<Node<T>> queue = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        queue.add(node);
        while (!queue.isEmpty()) {
            Node<T> current = queue.poll();
            min = Math.min((Integer) current.value, min);
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return min;
    }

}
