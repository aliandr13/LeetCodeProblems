package easy;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class L144 {
    // pre-order -> root - left - right
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversal(root, result);
        return result;
    }

    private void preorderTraversal(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);
        preorderTraversal(node.left, result);
        preorderTraversal(node.right, result);
    }

    // post-order -> left - right - root
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversal(root, result);
        return result;
    }

    private void postorderTraversal(TreeNode node, List<Integer> result) {
        if (node == null) return;
        postorderTraversal(node.left, result);
        postorderTraversal(node.right, result);
        result.add(node.val);
    }
}
