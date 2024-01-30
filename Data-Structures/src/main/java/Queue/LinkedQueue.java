package Queue;

import LinkedList.CDLinkedList;
import Stack.LinkedStack;

public class LinkedQueue<E> implements Queue<E>{
    private final CDLinkedList<E> elements;
    public LinkedQueue(){
        elements = new CDLinkedList<>();
    }
    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public E first() {
        return elements.first();
    }

    @Override
    public void enqueue(E element) {
        elements.addLast(element);
    }

    @Override
    public E dequeue() {
        return elements.removeFirst();
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
