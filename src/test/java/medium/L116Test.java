package medium;

import org.junit.jupiter.api.Test;
import tree.Node;

import static org.assertj.core.api.Assertions.assertThat;

class L116Test {

    @Test
    void connect() {
        L116 l = new L116();
        Node root = Node.of(1);
        root.left = Node.of(2).withLeft(4).withRight(5);
        root.right = Node.of(3).withRight(7).withLeft(6);
        Node node = l.connect2(root);
        System.out.println(node);
        assertThat(node.val).isEqualTo(1);
        assertThat(node.left.val).isEqualTo(2);
        assertThat(node.right.val).isEqualTo(3);
        assertThat(node.next).isNull();
        assertThat(node.left.next.val).isEqualTo(3);
    }
}