package com.walking.lesson28_Generics.Task4_Stack.model;

import com.walking.lesson28_Generics.Task3.exception.ElementNotFoundException;

import java.util.EmptyStackException;

public class MyStack<T> {
    private Node<T> top;
    private int size;

    public void push(T value) {
        Node<T> node = new Node<>(value);
        node.setNext(top);
        top = node;
        size++;
    }

    public void pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        top = top.getNext();
        size--;
    }

    public T find(T value) {
        Node<T> current = top;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        throw new ElementNotFoundException();
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> current = top;

        while (current != null) {
            result.append(current.getValue());
            if (current.getNext() != null) {
                result.append(", ");
            }
            current = current.getNext();
        }
        result.append("]");
        return result.toString();
    }
}
