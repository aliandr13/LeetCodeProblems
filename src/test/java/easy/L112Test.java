package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class L112Test {

    @Test
    void hasPathSum() {
        L112 l = new L112();
        assertThat(l.hasPathSum(TreeNodeUtils.getBST(), 9)).isTrue();
        assertThat(l.hasPathSum(TreeNodeUtils.getBST(), 10)).isFalse();
        assertThat(l.hasPathSum(null, 0)).isFalse();
    }
}