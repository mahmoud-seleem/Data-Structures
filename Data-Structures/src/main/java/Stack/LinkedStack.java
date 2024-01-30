package Stack;

import LinkedList.CDLinkedList;

public class LinkedStack<E> implements Stack<E>{
    private CDLinkedList<E> elements;
    public LinkedStack(){
        this.elements = new CDLinkedList<>();
    }

    public CDLinkedList<E> getElements() {
        return elements;
    }

    public void setElements(CDLinkedList<E> elements) {
        this.elements = elements;
    }

    @Override
    public int size() {
        return getElements().size();
    }

    @Override
    public boolean isEmpty() {
        return getElements().isEmpty();
    }

    @Override
    public void push(E element) {
        getElements().addFirst(element);
    }

    @Override
    public E pop() {
        return getElements().removeFirst();
    }

    @Override
    public E top() {
        return getElements().first();
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
