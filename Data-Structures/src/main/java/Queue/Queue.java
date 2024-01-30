package Queue;

public interface Queue<E> {
    int size();
    boolean isEmpty();
    E first();
    void Enqueue(E element);
    E dequeue();

}
