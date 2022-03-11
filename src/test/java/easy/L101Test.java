package easy;

import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static easy.TreeNodeUtils.getBST;
import static org.assertj.core.api.Assertions.assertThat;

class L101Test {

    @Test
    void isSymmetric() {
        L101 l = new L101();

        TreeNode tree = TreeNode.of(1);
        tree.left = TreeNode.of(2).withLeft(TreeNode.of(3)).withRight(TreeNode.of(4));
        tree.right = TreeNode.of(2).withLeft(TreeNode.of(4)).withRight(TreeNode.of(3));

        assertThat(l.isSymmetric(tree)).isTrue();
        assertThat(l.isSymmetric(TreeNode.of(9))).isTrue();
    }
}