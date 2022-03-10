package tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class BreadsFirstValuesTest {
    //      a
    //     / \
    //    b   c
    //   / \   \
    //  d   e   f
    @Test
    void travers() {
        Node<Character> tree = TreeUtils.getTree();
        BreadsFirstValues<Character> bfv = new BreadsFirstValues<>();
        List<Character> treeValues = bfv.travers(tree);

        Assertions.assertThat(treeValues)
                .isNotEmpty()
                .containsExactly('a', 'b', 'c', 'd', 'e', 'f');
    }

    @Test
    void includes() {
        BreadsFirstValues<Character> bfv = new BreadsFirstValues<>();
        Boolean includes = bfv.includes(TreeUtils.getTree(), 'e');
        Assertions.assertThat(includes).isTrue();
    }

    @Test
    void notIncludes() {
        BreadsFirstValues<Character> bfv = new BreadsFirstValues<>();
        Boolean includes = bfv.includes(TreeUtils.getTree(), 'h');
        Assertions.assertThat(includes).isFalse();
    }

    @Test
    void emptyIncludes() {
        BreadsFirstValues<Character> bfv = new BreadsFirstValues<>();
        Boolean includes = bfv.includes(null, 'h');
        Assertions.assertThat(includes).isFalse();
    }

    @Test
    void treeSum() {
        BreadsFirstValues<Integer> bfv = new BreadsFirstValues<>();
        Integer sum = bfv.treeSum(TreeUtils.getIntTree());
        Assertions.assertThat(sum).isEqualTo(21);
    }

    @Test
    void min() {
        BreadsFirstValues<Integer> bfv = new BreadsFirstValues<>();
        Integer min = bfv.treeMinValue(TreeUtils.getIntTree());
        Assertions.assertThat(min).isEqualTo(-2);
    }
}