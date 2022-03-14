package medium;

import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

class L105Test {

    @Test
    void buildTree() {
        L105 l = new L105();
        TreeNode node = l.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        System.out.println(node);
        assertThat(node.val).isEqualTo(3);
        assertThat(node.left.val).isEqualTo(9);
        assertThat(node.right.val).isEqualTo(20);
        assertThat(node.right.left.val).isEqualTo(15);
        assertThat(node.right.right.val).isEqualTo(7);
    }
}