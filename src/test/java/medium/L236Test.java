package medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class L236Test {

    @Test
    void lowestCommonAncestor() {
        L236 l = new L236();

        TreeNode a = TreeNode.of(1);
        TreeNode b = TreeNode.of(2);
        TreeNode c = TreeNode.of(3);
        assertThat(l.lowestCommonAncestor(a.withLeft(b).withRight(c), b, c)).isEqualTo(a);
        assertThat(l.lowestCommonAncestor(a.withLeft(b).withRight(c), a, c)).isEqualTo(a);

    }
}