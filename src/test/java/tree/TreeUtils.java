package tree;

import java.util.List;

public final class TreeUtils {

    //      a
    //     / \
    //    b   c
    //   / \   \
    //  d   e   f
    public static MyNode<Character> getTree() {
        MyNode<Character> a = new MyNode<>('a');
        MyNode<Character> b = new MyNode<>('b');
        MyNode<Character> c = new MyNode<>('c');
        MyNode<Character> d = new MyNode<>('d');
        MyNode<Character> e = new MyNode<>('e');
        MyNode<Character> f = new MyNode<>('f');

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        return a;
    }

    //      3
    //     / \
    //    11   4
    //   / \   \
    //  4   -2  1
    public static MyNode<Integer> getIntTree() {
        return getIntTree(List.of(3, 11, 4, -2, 4, 1));
    }

    public static MyNode<Integer> getIntTree(List<Integer> nums) {
        MyNode<Integer> a = MyNode.of(nums.get(0));
        MyNode<Integer> b = MyNode.of(nums.get(1));
        MyNode<Integer> c = MyNode.of(nums.get(2));
        MyNode<Integer> d = MyNode.of(nums.get(3));
        MyNode<Integer> e = MyNode.of(nums.get(4));
        MyNode<Integer> f = MyNode.of(nums.get(5));

        a.left = b;
        a.right = c;
        b.right = d;
        b.left = e;
        c.right = f;
        return a;
    }

}
