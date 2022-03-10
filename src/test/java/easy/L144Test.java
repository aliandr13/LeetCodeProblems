package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import tree.TreeNode;

import java.util.List;

class L144Test {

    @Test
    void preorderTraversalTest() {
        L144 l = new L144();
        TreeNode tree = TreeNodeUtils.getBST();
        List<Integer> actual = l.preorderTraversal(tree);
        System.out.println(actual);
        Assertions.assertThat(actual).containsExactly(4, 2, 1, 3, 5, 6);
    }

    @Test
    void postorderTraversalTest() {
        L144 l = new L144();
        TreeNode tree = TreeNodeUtils.getBST();
        List<Integer> actual = l.postorderTraversal(tree);
        System.out.println(actual);
        Assertions.assertThat(actual).containsExactly(1,3,2,6,5,4);
    }

}