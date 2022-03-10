package tree;

import java.util.*;

public class DepthFirstValues<T> {

    public List<T> travers(Node<T> root) {
        List<T> result = new ArrayList<>();
        if (root == null) return result;
        Deque<Node<T>> stack = new LinkedList<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            Node<T> current = stack.pop();
            result.add(current.value);
            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }
        return result;
    }

    public List<T> traversRecursive(Node<T> root) {
        List<T> result = new ArrayList<>();
        traversRecursive(root, result);
        return result;
    }

    public void traversRecursive(Node<T> node, List<T> result) {
        if (node == null) return;
        result.add(node.value);
        if (node.left != null) traversRecursive(node.left, result);
        if (node.right != null) traversRecursive(node.right, result);
    }

    public Collection<T> traversRecursiveL(Node<T> node) {
        if (node == null) return List.of();
        Collection<T> lr;
        if (node.left != null) {
            lr = traversRecursive(node.left);
        } else {
            lr = List.of();
        }
        Collection<T> rr;
        if (node.right != null) {
            rr = traversRecursive(node.right);
        } else {
            rr = List.of();
        }
        ArrayList<T> result = new ArrayList<>(lr.size() + rr.size() + 1);
        result.add(node.value);
        result.addAll(lr);
        result.addAll(rr);
        return result;
    }

    public boolean includes(Node<T> node, T target) {
        if (node == null) return false;
        if (target.equals(node.value)) return true;
        return includes(node.left, target) || includes(node.right, target);
    }

    public int treeSum(Node<T> node) {
        if (node == null) return 0;
        return ((Integer) node.value) + treeSum(node.left) + treeSum(node.right);
    }

    public int treeMinValue(Node<T> node) {
        if (node == null) return Integer.MAX_VALUE;
        return Math.min(Math.min((Integer) node.value, treeMinValue(node.left)), treeMinValue(node.right));
    }

    /*
     * if only positive values
     */
    public int maxPathSum(Node<Integer> node) {
        if (node == null) return 0;
        int left = maxPathSum(node.left);
        int right = maxPathSum(node.right);
        return node.value + Math.max(left, right);
    }

    /*
     * positive and negative values
     */
    public int maxPathSumNegativeValues(Node<Integer> node) {
        if (node == null) return Integer.MIN_VALUE;
        if (node.right == null && node.left == null) return node.value;
        int maxChildPath = Math.max(maxPathSumNegativeValues(node.left), maxPathSumNegativeValues(node.right));
        return node.value + maxChildPath;
    }

}
