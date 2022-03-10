package tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;


class DepthFirstValuesTest {

    @Test
    void test() {
        DepthFirstValues<Character> dfv = new DepthFirstValues<>();
        List<Character> treeValues = dfv.travers(TreeUtils.getTree());

        Assertions.assertThat(treeValues)
                .isNotEmpty()
                .containsExactly('a', 'b', 'd', 'e', 'c', 'f');
    }

    @Test
    void testRecursive() {
        DepthFirstValues<Character> dfv = new DepthFirstValues<>();
        List<Character> treeValues = dfv.traversRecursive(TreeUtils.getTree());

        Assertions.assertThat(treeValues)
                .isNotEmpty()
                .containsExactly('a', 'b', 'd', 'e', 'c', 'f');
    }

    @Test
    void testRecursiveL() {
        DepthFirstValues<Character> dfv = new DepthFirstValues<>();
        Collection<Character> treeValues = dfv.traversRecursiveL(TreeUtils.getTree());

        Assertions.assertThat(treeValues)
                .isNotEmpty()
                .containsExactly('a', 'b', 'd', 'e', 'c', 'f');
    }

    @Test
    void testRecursiveOneNode() {
        DepthFirstValues<Character> dfv = new DepthFirstValues<>();
        List<Character> treeValues = dfv.traversRecursive(Node.of('a'));

        Assertions.assertThat(treeValues)
                .isNotEmpty()
                .containsExactly('a');
    }

    @Test
    void includes() {
        DepthFirstValues<Character> dfv = new DepthFirstValues<>();
        Node<Character> tree = TreeUtils.getTree();
        Assertions.assertThat((Boolean) dfv.includes(tree, 'f')).isTrue();
        Assertions.assertThat((Boolean) dfv.includes(tree, 'g')).isFalse();
        Assertions.assertThat((Boolean) dfv.includes(null, 'f')).isFalse();
    }

    @Test
    void treeSum() {
        DepthFirstValues<Integer> dfv = new DepthFirstValues<>();
        Node<Integer> tree = TreeUtils.getIntTree();
        Assertions.assertThat((Integer) dfv.treeSum(tree)).isEqualTo(25);
        Assertions.assertThat((Integer) dfv.treeSum(null)).isEqualTo(0);
    }

    @Test
    void treeMin() {
        DepthFirstValues<Integer> dfv = new DepthFirstValues<>();
        Node<Integer> tree = TreeUtils.getIntTree();
        Assertions.assertThat((Integer) dfv.treeMinValue(tree)).isEqualTo(-2);
        Assertions.assertThat((Integer) dfv.treeMinValue(Node.of(42))).isEqualTo(42);
    }

    @Test
    void treeMaxPathSum() {
        DepthFirstValues<Integer> dfv = new DepthFirstValues<>();
        Node<Integer> tree = TreeUtils.getIntTree(List.of(5, 11, 3, 4, 2, 1));
        Assertions.assertThat(dfv.maxPathSum(tree)).isEqualTo(20);
    }

    @Test
    void treeMaxPathSumNegative() {
        DepthFirstValues<Integer> dfv = new DepthFirstValues<>();
        Node<Integer> tree = TreeUtils.getIntTree(List.of(3, 11, 4, 4, -2, 1));
        Assertions.assertThat(dfv.maxPathSumNegativeValues(tree)).isEqualTo(18);
    }

}