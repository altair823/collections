package collectionsjava.LinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class NodeTest {
    @Test
    void NodeGetSetTest() {
        Node<Integer> node = new Node<>(3);
        assertEquals(node.getValue(), 3);
        node.setValue(2);
        assertEquals(node.getValue(), 2);

        Node<Integer> nextNode = new Node<>(4);
        node.setNext(nextNode);
        assertEquals(node.getNext(), nextNode);

        Node<Integer> prevNode = new Node<>(1);
        node.setPrev(prevNode);
        assertEquals(node.getPrev(), prevNode);
    }
}
