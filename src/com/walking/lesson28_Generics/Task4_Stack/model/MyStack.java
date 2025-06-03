package com.walking.lesson28_Generics.Task4_Stack.model;

public class MyStack<T> {
    private Node<T> top;
    private int size;

    public void push(T value) {
        Node<T> node = new Node<>(value);
        node.setNext(top);
        top = node;
        size++;
    }

    public int size() {
        return size;
    }
}
