package medium;

import easy.L112;
import easy.TreeNodeUtils;
import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class L250Test {
    @Test
    void hasPathSum() {
        L250 l = new L250();
//        assertThat(l.countUnivalSubtrees(null)).isEqualTo(0);
//        assertThat(l.countUnivalSubtrees(TreeNodeUtils.getBST())).isEqualTo(3);
        TreeNode tree = TreeNode.of(4);
        tree.left = TreeNode.of(3).withLeft(TreeNode.of(3)).withRight(TreeNode.of(3));
        tree.right = TreeNode.of(5).withRight(TreeNode.of(5));
//        assertThat(l.countUnivalSubtrees(tree)).isEqualTo(5);
        assertThat(l.countUnivalSubtrees(TreeNode.of(5).withLeft(5).withRight(1))).isEqualTo(2);
    }
}