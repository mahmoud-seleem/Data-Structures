package LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        CDLinkedList<String> strings = new CDLinkedList<>();
        strings.addFirst("mahmoud");
        strings.addLast("mohamed");
        strings.addLast("sha7at");
        strings.addLast("seleem");
        System.out.println(strings);
        strings.rotate();
        System.out.println(strings);
        strings.rotate();
        System.out.println(strings);
        strings.rotate();
        System.out.println(strings);
        strings.rotate();
        System.out.println(strings);
    }
}
