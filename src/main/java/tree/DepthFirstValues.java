package tree;

import java.util.*;

public class DepthFirstValues<T> {

    public List<T> travers(MyNode<T> root) {
        List<T> result = new ArrayList<>();
        if (root == null) return result;
        Deque<MyNode<T>> stack = new LinkedList<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            MyNode<T> current = stack.pop();
            result.add(current.value);
            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }
        return result;
    }

    public List<T> traversRecursive(MyNode<T> root) {
        List<T> result = new ArrayList<>();
        traversRecursive(root, result);
        return result;
    }

    public void traversRecursive(MyNode<T> myNode, List<T> result) {
        if (myNode == null) return;
        result.add(myNode.value);
        if (myNode.left != null) traversRecursive(myNode.left, result);
        if (myNode.right != null) traversRecursive(myNode.right, result);
    }

    public Collection<T> traversRecursiveL(MyNode<T> myNode) {
        if (myNode == null) return List.of();
        Collection<T> lr;
        if (myNode.left != null) {
            lr = traversRecursive(myNode.left);
        } else {
            lr = List.of();
        }
        Collection<T> rr;
        if (myNode.right != null) {
            rr = traversRecursive(myNode.right);
        } else {
            rr = List.of();
        }
        ArrayList<T> result = new ArrayList<>(lr.size() + rr.size() + 1);
        result.add(myNode.value);
        result.addAll(lr);
        result.addAll(rr);
        return result;
    }

    public boolean includes(MyNode<T> myNode, T target) {
        if (myNode == null) return false;
        if (target.equals(myNode.value)) return true;
        return includes(myNode.left, target) || includes(myNode.right, target);
    }

    public int treeSum(MyNode<T> myNode) {
        if (myNode == null) return 0;
        return ((Integer) myNode.value) + treeSum(myNode.left) + treeSum(myNode.right);
    }

    public int treeMinValue(MyNode<T> myNode) {
        if (myNode == null) return Integer.MAX_VALUE;
        return Math.min(Math.min((Integer) myNode.value, treeMinValue(myNode.left)), treeMinValue(myNode.right));
    }

    /*
     * if only positive values
     */
    public int maxPathSum(MyNode<Integer> myNode) {
        if (myNode == null) return 0;
        int left = maxPathSum(myNode.left);
        int right = maxPathSum(myNode.right);
        return myNode.value + Math.max(left, right);
    }

    /*
     * positive and negative values
     */
    public int maxPathSumNegativeValues(MyNode<Integer> myNode) {
        if (myNode == null) return Integer.MIN_VALUE;
        if (myNode.right == null && myNode.left == null) return myNode.value;
        int maxChildPath = Math.max(maxPathSumNegativeValues(myNode.left), maxPathSumNegativeValues(myNode.right));
        return myNode.value + maxChildPath;
    }

}
