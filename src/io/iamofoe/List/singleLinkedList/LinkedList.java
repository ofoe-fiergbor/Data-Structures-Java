package io.iamofoe.List.singleLinkedList;

import io.iamofoe.List.List;

import java.util.Collection;

public class LinkedList<T> implements List<T> {
    private Node<T> head;

    @Override
    public boolean add(T element) {
        Node<T> node = new Node<>();
        node.data = element;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node<T> n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
        return true;
    }

    @Override
    public void add(int index, T element) {
        //TODO
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        //TODO
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> collection) {
        //TODO
        return false;
    }

    @Override
    public void clear() {
        //TODO
    }

    @Override
    public boolean contains(Object object) {
        //TODO
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        //TODO
        return false;
    }

    @Override
    public T get(int index) {
        //TODO
        return null;
    }

    @Override
    public int indexOf(Object object) {
        //TODO
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int lastIndexOf(Object object) {
        //TODO
        return 0;
    }

    @Override
    public T remove(int index) {
        //TODO
        return null;
    }

    @Override
    public boolean remove(Object object) {
        //TODO
        return false;
    }

    @Override
    public T set(int index, T element) {
        Node<T> node = new Node<>();
        node.data = element;

        if (index == 0) {
            insertAtStart(element);
        }

        Node<T> n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
        return element;
    }

    public void insertAtStart(T element) {
        Node<T> node = new Node<>();
        node.data = element;
        node.next = head;
        head = node;
    }

    @Override
    public int size() {
        int result = 0;
        Node<T> node = head;
        while (node != null && node.next != null) {
            node = node.next;
            result++;
        }
        return node != null ? result + 1 : result;
    }
}
