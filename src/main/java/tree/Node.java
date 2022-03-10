package tree;

public class Node<T> {

    public final T value;
    public Node<T> left;
    public Node<T> right;

    public Node(T value) {
        this.value = value;
    }

    public static <T> Node<T> of(T value) {
        return new Node<>(value);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + (left == null ? "null" : left.value) +
                ", right=" + (right == null ? "null" : right.value) +
                '}';
    }
}
