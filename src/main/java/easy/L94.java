package easy;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class L94 {
    // In-order -> left - root - right
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    private void inorderTraversal(TreeNode node, List<Integer> result) {
        if (node == null) return;
        inorderTraversal(node.left, result);
        result.add(node.val);
        inorderTraversal(node.right, result);
    }
}
