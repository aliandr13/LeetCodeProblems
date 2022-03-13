package medium;

import tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two integer arrays inorder and postorder where inorder
 * is the inorder traversal of a binary tree and postorder
 * is the postorder traversal of the same tree, construct and return the binary tree.
 */
public class L106 {

    private int[] postorder;
    private int index;
    private final Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        this.index = postorder.length - 1;

        for (int i = 0; i < inorder.length; i++) {
            System.out.println("index " + i);
            System.out.println("val " + inorder[i]);
            map.put(inorder[i], i);
        }

        return buildTree(0, inorder.length - 1);
    }

    private TreeNode buildTree(int left, int right) {
        if (left > right) return null;

        int currentVal = postorder[index--];
        TreeNode node = TreeNode.of(currentVal);

        Integer inIndex = map.get(currentVal);

        node.right = buildTree(inIndex + 1, right);
        node.left = buildTree(left, inIndex - 1);

        return node;
    }

}
