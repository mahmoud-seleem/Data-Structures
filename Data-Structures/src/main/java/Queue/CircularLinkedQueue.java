package Queue;

public class CircularLinkedQueue<E> extends LinkedQueue<E>{

    public void rotate(){
        this.getElements().rotate();
    }
}
