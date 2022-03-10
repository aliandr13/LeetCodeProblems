package medium;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return List.of();
        Queue<List<TreeNode>> queue = new LinkedList<>();
        queue.add(List.of(root));
        List<List<Integer>> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            List<TreeNode> current = queue.poll();
            List<TreeNode> next = new ArrayList<>();
            List<Integer> currentLevel = new ArrayList<>();
            for (TreeNode node : current) {
                currentLevel.add(node.val);
                if (node.left != null) next.add(node.left);
                if (node.right != null) next.add(node.right);
            }
            if (!next.isEmpty()) queue.add(next);
            result.add(currentLevel);
        }
        return result;
    }
}
