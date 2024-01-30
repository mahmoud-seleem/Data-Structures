package Queue;

public class ArrayQueue <E> implements Queue<E>{
    private static final int DEFAULT_CAPACITY = 1000;
    private E[] elements;
    private int head = 0;
    private int size = 0;
    public ArrayQueue(){
        this(DEFAULT_CAPACITY);
    }
    public ArrayQueue(int capacity){
        elements = (E[]) new Object[capacity];
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E first() {
        return (isEmpty()) ? null : elements[head];
    }

    @Override
    public void Enqueue(E element) {
        if (size == elements.length){
            // queue is full and should throw exception
        }
        else{
            elements[(head + size )% elements.length] = element;
            size++;
        }
    }

    @Override
    public E dequeue() {
        if (isEmpty()){
            return null;
        }else{
            E temp = elements[head];
            elements[head] = null;
            head = (head + 1) % elements.length;
            size--;
            return temp;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("");
        for (int i = head , j = 0 ;j < size ; j ++ ,i = (i + 1) % elements.length){
                result.append(elements[i] + "\n");
        }
        return result.toString();
    }
}
