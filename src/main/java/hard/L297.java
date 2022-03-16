package hard;

import tree.TreeNode;

public class L297 {
    private static final String SEP = ",";
    public static final String NULL = "null";

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    // preorder root, left, right
    private void serialize(TreeNode node, StringBuilder sb) {
        if (node == null) sb.append(NULL).append(SEP);
        else {
            sb.append(node.val).append(SEP);
            serialize(node.left, sb);
            serialize(node.right, sb);
        }
    }

    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) return null;

        String[] values = data.split(SEP);
        if (values.length == 0) return null;

        return deserialize(values);
    }

    private int pointer = 0;

    private TreeNode deserialize(String[] values) {
        if (pointer >= values.length) return null;
        String value = values[pointer++];
        if (NULL.equals(value)) return null;

        TreeNode node = new TreeNode(Integer.parseInt(value));
        node.left = deserialize(values);
        node.right = deserialize(values);
        return node;
    }

}
