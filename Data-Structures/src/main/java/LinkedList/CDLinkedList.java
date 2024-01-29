package LinkedList;

import java.util.Iterator;

public class CDLinkedList<E>{


    private class Node<E>{
        private E element;
        private Node<E> next;
        private Node<E> prev;

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
    private Node<E> header;
    private Node<E> trailer;
    private int size;

    public CDLinkedList() {
        header = new Node<>(null,null,null);
        trailer = new Node<>(null ,header,header);
        header.setNext(trailer);
        header.setPrev(trailer);
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0 ;
    }
    public E first(){
        return (isEmpty())? null : header.getNext().getElement();
    }
    public E last(){
        return (isEmpty())? null : trailer.getPrev().getElement();
    }
    private void addBetween(E element , Node<E> next,Node<E> prev){
        Node<E> newest = new Node<>(element,next,prev);
        prev.setNext(newest);
        next.setPrev(newest);
        size++;
    }
    private E removeNode(Node<E> node){
        E temp = node.getElement();
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
        node.setPrev(null);
        node.setNext(null);
        node.setElement(null);
        size-- ;
        return temp;
    }
    public void addFirst(E element){
        addBetween(element,header.getNext(),header);
    }
    public void addLast(E element){
        addBetween(element,trailer,trailer.getPrev());
    }
    public E removeFirst(){
        return (isEmpty()) ? null : removeNode(header.getNext());
    }
    public E removeLast(){
        return (isEmpty()) ? null: removeNode(trailer.getPrev());
    }
    public void rotate(){
        if (size() <= 1);
        else {
            Node<E> temp = header.getNext();
            header.setNext(temp.getNext());
            temp.getNext().setPrev(header);
            temp.setNext(trailer);
            temp.setPrev(trailer.getPrev());
            trailer.getPrev().setNext(temp);
            trailer.setPrev(temp);
        }
    }
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("[ ");
        Node<E> cur = header;
        for (int i = 0; i < size(); i++) {
            output.append(cur.getNext().getElement());
            output.append(" , ");
            cur = cur.getNext();
        }
        output.deleteCharAt(output.length() - 1);
        output.deleteCharAt(output.length() -2);
        output.append("]");
        return output.toString();
    }
}
