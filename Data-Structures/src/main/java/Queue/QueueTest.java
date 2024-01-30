package Queue;

public class QueueTest {
    public static void main(String[] args) {
        CircularLinkedQueue<Integer> queue = new CircularLinkedQueue<Integer>();
        queue.enqueue(5555);
        queue.enqueue(5);
        queue.enqueue(55);
        queue.enqueue(56);
        System.out.println(queue);
        queue.rotate();
        System.out.println(queue);
    }
}
