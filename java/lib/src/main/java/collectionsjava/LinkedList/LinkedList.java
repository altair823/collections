package collectionsjava.LinkedList;

import collectionsjava.List;
import lombok.Getter;

public class LinkedList<T> implements List<T> {
    @Getter
    private int length;
    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> newNode = new Node<>(element);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else if (index == 0) {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        } else if (index == length) {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        } else {
            Node<T> node = getNode(index);
            newNode.setNext(node);
            newNode.setPrev(node.getPrev());
            node.getPrev().setNext(newNode);
            node.setPrev(newNode);
        }
    }

    @Override
    public boolean add(T t) {
        Node<T> newNode = new Node<>(t);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        length++;
        return true;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        return getNode(index).getValue();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return this.length;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    private Node<T> getNode(int index) {
        Node<T> node;
        if (index < length / 2) {
            node = head;
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
        } else {
            node = tail;
            for (int i = length - 1; i > index; i--) {
                node = node.getPrev();
            }
        }
        return node;
    }
}
