package Queue;

public class QueueTest {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<Integer>(5);
        queue.enqueue(10);
        queue.enqueue(5);
        queue.enqueue(11);
        queue.dequeue();
        queue.enqueue(12);
        queue.enqueue(4);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(555);
        queue.enqueue(5555);
        queue.dequeue();
        System.out.println(queue);
    }
}
