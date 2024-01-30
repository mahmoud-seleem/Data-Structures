package Stack;

import javax.annotation.processing.SupportedAnnotationTypes;

public class ArrayStack<E> implements Stack<E>{
    private static final int DEFAULT_CAPACITY = 1000;
    private E[] elements;
    private int topIndex = -1 ;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }
    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.elements = (E[]) new Object[capacity];
    }

    public E[] getElements() {
        return elements;
    }

    public void setElements(E[] elements) {
        this.elements = elements;
    }

    public int getTopIndex() {
        return topIndex;
    }

    public void setTopIndex(int topIndex) {
        this.topIndex = topIndex;
    }

    @Override
    public int size() {
        return topIndex + 1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public void push(E element) {
        if(topIndex == elements.length -1){
            // throw exception
        }else elements[++topIndex] = element;
    }

    @Override
    public E pop() {
        if (isEmpty()) return null;
        E e = elements[topIndex];
        elements[topIndex] = null;
        topIndex--;
        return e;
    }

    @Override
    public E top() {
        return (isEmpty()) ? null : elements[topIndex];
    }
}
