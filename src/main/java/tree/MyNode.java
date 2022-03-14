package tree;

public class MyNode<T> {

    public final T value;
    public MyNode<T> left;
    public MyNode<T> right;

    public MyNode(T value) {
        this.value = value;
    }

    public static <T> MyNode<T> of(T value) {
        return new MyNode<>(value);
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
