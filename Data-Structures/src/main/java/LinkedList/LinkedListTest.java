package LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        CDLinkedList<String> strings = new CDLinkedList<>();
        strings.addFirst("mahmoud");
        strings.addLast("mohamed");
        strings.addLast("sha7at");
        strings.addLast("seleem");
        long start1 = System.nanoTime();
        strings.rotate();
        long end1 = System.nanoTime();
        System.out.println(end1 - start1);
        long start2 = System.nanoTime();
        strings.rotateV2();
        long end2 = System.nanoTime();
        System.out.println(end2 - start2);
    }
}
