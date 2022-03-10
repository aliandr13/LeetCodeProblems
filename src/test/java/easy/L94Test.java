package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import tree.TreeNode;

import java.util.List;

class L94Test {

    @Test
    void inOrderTest() {
        L94 l = new L94();
        TreeNode tree = TreeNodeUtils.getBST();
        List<Integer> actual = l.inorderTraversal(tree);
        System.out.println(actual);
        Assertions.assertThat(actual).containsExactly(1, 2, 3, 4, 5, 6);
    }

}