package medium;

import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;


class L106Test {

    @Test
    void buildTree() {
        L106 l106 = new L106();
        TreeNode node = l106.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
        System.out.println(node);
        assertThat(node.val).isEqualTo(3);
        assertThat(node.left.val).isEqualTo(9);
        assertThat(node.right.val).isEqualTo(20);
    }
}