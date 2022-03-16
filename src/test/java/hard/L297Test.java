package hard;

import org.junit.jupiter.api.Test;
import tree.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

class L297Test {

    @Test
    void serialize() {
        L297 l = new L297();
        assertThat(l.serialize(TreeNode.of(1).withRight(3).withLeft(2))).isEqualTo("1,2,3");
        assertThat(l.serialize(TreeNode.of(1).withLeft(2))).isEqualTo("1,2");
        assertThat(l.serialize(TreeNode.of(1).withRight(3))).isEqualTo("1,null,3");
        TreeNode root = TreeNode.of(1);
        root.left = TreeNode.of(2).withLeft(4);
        root.right = TreeNode.of(3).withRight(5);
        assertThat(l.serialize(root)).isEqualTo("1,2,3,4,null,null,5");
    }

    @Test
    void deserialize() {
        L297 l = new L297();
        TreeNode treeNode = l.deserialize("1,null,3");
        assertThat(treeNode).isNotNull();
        assertThat(treeNode.val).isEqualTo(1);
        assertThat(treeNode.left).isNull();
        assertThat(treeNode.right.val).isEqualTo(3);
    }

    @Test
    void deserialize2() {
        L297 l = new L297();
        TreeNode treeNode = l.deserialize("1,2,4,null,null,null,3,null,5,null,null");
        assertThat(treeNode).isNotNull();
        assertThat(treeNode.val).isEqualTo(1);
        assertThat(treeNode.left.val).isEqualTo(2);
        assertThat(treeNode.left.left.val).isEqualTo(4);
        assertThat(treeNode.left.right).isNull();
        assertThat(treeNode.right.val).isEqualTo(3);
        assertThat(treeNode.right.right.val).isEqualTo(5);
        assertThat(treeNode.right.left).isNull();
    }
}