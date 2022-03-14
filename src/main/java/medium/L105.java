package medium;

import tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two integer arrays preorder and inorder
 * where preorder is the preorder traversal of
 * a binary tree and inorder is the inorder traversal
 * of the same tree, construct and return the binary tree.
 */
public class L105 {
    private int[] preorder;
    private int index;
    private final Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.index = 0;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return getNode(0, inorder.length - 1);
    }

    private TreeNode getNode(int left, int right) {
        if (right < left) return null;

        int nodeVal = preorder[index++];
        TreeNode node = new TreeNode(nodeVal);
        int inOrderIndex = map.get(node.val);

        node.left = getNode(left, inOrderIndex - 1);
        node.right = getNode(inOrderIndex + 1, right);

        return node;
    }
}
