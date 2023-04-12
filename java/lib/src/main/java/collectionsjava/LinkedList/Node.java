package collectionsjava.LinkedList;

import lombok.Getter;
import lombok.Setter;

public class Node<T> {
    @Getter @Setter
    private Node<T> next;

    @Getter @Setter
    private Node<T> prev;

    @Getter @Setter
    private T value;

    public Node(T value) {
        this.next = null;
        this.prev = null;
        this.value = value;
    }
}
