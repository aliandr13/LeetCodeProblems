package tree;

import java.util.List;

public final class TreeUtils {

    //      a
    //     / \
    //    b   c
    //   / \   \
    //  d   e   f
    public static Node<Character> getTree() {
        Node<Character> a = new Node<>('a');
        Node<Character> b = new Node<>('b');
        Node<Character> c = new Node<>('c');
        Node<Character> d = new Node<>('d');
        Node<Character> e = new Node<>('e');
        Node<Character> f = new Node<>('f');

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        return a;
    }

    public static Node<Integer> getIntTree() {
        return getIntTree(List.of(3, 11, 4, -2, 4, 1));
    }

    public static Node<Integer> getIntTree(List<Integer> nums) {
        Node<Integer> a = Node.of(nums.get(0));
        Node<Integer> b = Node.of(nums.get(1));
        Node<Integer> c = Node.of(nums.get(2));
        Node<Integer> d = Node.of(nums.get(3));
        Node<Integer> e = Node.of(nums.get(4));
        Node<Integer> f = Node.of(nums.get(5));

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        return a;
    }

}
