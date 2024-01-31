package Queue;

public class CircularLinkedDeQueue<E> extends CircularLinkedQueue<E>{
    public void addFirst(E element){
        getElements().addFirst(element);
    }
    public E removeLast(){
        return getElements().removeLast();
    }
}
