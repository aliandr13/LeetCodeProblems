package easy;

import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static easy.TreeNodeUtils.getBST;
import static org.assertj.core.api.Assertions.assertThat;

class L104Test {

    @Test
    void maxDepth() {
        L104 l = new L104();
        assertThat((Integer) l.maxDepth(getBST())).isEqualTo(3);
        assertThat((Integer) l.maxDepth(TreeNode.of(9))).isEqualTo(1);
        assertThat((Integer) l.maxDepth(null)).isEqualTo(0);
    }

    @Test
    void maxDepthIter() {
        L104 l = new L104();
        assertThat((Integer) l.maxDepthIter(getBST())).isEqualTo(3);
        assertThat((Integer) l.maxDepthIter(TreeNode.of(9))).isEqualTo(1);
        assertThat((Integer) l.maxDepthIter(null)).isEqualTo(0);
    }
}