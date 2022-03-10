package medium;

import easy.TreeNodeUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import tree.TreeNode;

import java.util.List;

class L102Test {

    @Test
    void inOrderTest() {
        L102 l = new L102();
        TreeNode tree = TreeNodeUtils.getBST();
        List<List<Integer>> actual = l.levelOrder(tree);
        System.out.println(actual);
        Assertions.assertThat(actual).containsExactly(List.of(4), List.of(2, 5), List.of(1, 3, 6));
    }

}